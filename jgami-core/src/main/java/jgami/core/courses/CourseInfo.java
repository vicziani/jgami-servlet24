package jgami.core.courses;

import java.time.LocalDate;

public class CourseInfo {

    private String id;

    private String name;

    private String description;

    private LocalDate start;

    private LocalDate end;

    public CourseInfo(String id, String name, String description, LocalDate start, LocalDate end) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.start = start;
        this.end = end;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }
}
