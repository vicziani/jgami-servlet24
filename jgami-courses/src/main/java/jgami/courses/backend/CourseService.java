package jgami.courses.backend;

import jgami.core.courses.CourseInfo;
import jgami.core.courses.CourseInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class CourseService implements CourseInfoService {

    private CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void createCourse(CreateCourseRequest createCourseRequest) {
        Course course = new Course(createCourseRequest.name, createCourseRequest.description,
                    createCourseRequest.start, createCourseRequest.end);
        courseRepository.save(course);
    }

    public List<CourseInfo> listCourses() {
        CourseInfoConverter courseInfoConverter = new CourseInfoConverter();
        return courseRepository.findAll().stream().map(c -> courseInfoConverter.convert(c)).collect(Collectors.toList());
    }

    @Override
    public CourseInfo findCourseById(String id) {
        return new CourseInfoConverter().convert(courseRepository.findOne(id));
    }
}
