package jgami.courses.backend;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository  {

    private List<Course> courses = new ArrayList<>();


    public void save(Course course) {
        courses.add(course);
    }

    public List<Course> findAll() {
        return new ArrayList<>(courses);
    }

    public Course findOne(String id) {
        return courses.stream().filter(c -> c.getId().equals(id)).findFirst().get();
    }
}
