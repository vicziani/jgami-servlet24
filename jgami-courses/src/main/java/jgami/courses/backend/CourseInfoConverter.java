package jgami.courses.backend;

import jgami.core.courses.CourseInfo;
import org.springframework.core.convert.converter.Converter;

public class CourseInfoConverter implements Converter<Course, CourseInfo> {

    @Override
    public CourseInfo convert(Course course) {
        return new CourseInfo(course.getId(), course.getName(), course.getDescription(), course.getStart(), course.getEnd());
    }
}
