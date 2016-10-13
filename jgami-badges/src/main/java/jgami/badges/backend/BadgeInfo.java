package jgami.badges.backend;

import java.time.LocalDateTime;

public class BadgeInfo {

    public final String id;

    public final String name;

    public final String email;

    public final String courseId;

    public final String courseName;

    public BadgeInfo(String id, String name, String email, String courseId, String courseName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.courseId = courseId;
        this.courseName = courseName;
    }
}
