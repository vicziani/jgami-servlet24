package jgami.badges.backend;

public class BadgeRequestInfo {

    public  String id;

    public  String name;

    public  String email;

    public  String courseName;

    public BadgeRequestInfo(String id, String name, String email, String courseName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.courseName = courseName;
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

    public String getCourseName() {
        return courseName;
    }
}
