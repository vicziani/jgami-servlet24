package jgami.badges.backend;

public class BadgeRequest {

    public final String name;

    public final String email;

    public final String courseId;

    public BadgeRequest(String name, String email, String courseId) {
        this.name = name;
        this.email = email;
        this.courseId = courseId;
    }
}
