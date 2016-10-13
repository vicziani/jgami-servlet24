package jgami.badges.stub;

import jgami.core.courses.CourseInfo;
import jgami.core.courses.CourseInfoService;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class StubCourseService implements CourseInfoService {

    private CourseInfo courseInfo = new CourseInfo("0000-0000", "test", "test", LocalDate.now(), LocalDate.now());

    @Override
    public List<CourseInfo> listCourses() {
        return Collections.singletonList(courseInfo);
    }

    @Override
    public CourseInfo findCourseById(String id) {
        return courseInfo;
    }
}
