package jgami.core.courses;

import java.util.List;

public interface CourseInfoService {

    List<CourseInfo> listCourses();

    CourseInfo findCourseById(String id);
}
