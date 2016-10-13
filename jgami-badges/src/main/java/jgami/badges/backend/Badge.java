package jgami.badges.backend;

import java.time.LocalDateTime;
import java.util.UUID;

public class Badge {

    private String id;

    private String name;

    private String email;

    private String courseId;

    private Badge() {
    }

    public Badge(String name, String email, String courseId) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.courseId = courseId;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCourseId() {
        return courseId;
    }

}
