package jgami.courses.backend;

import java.time.LocalDate;
import java.util.UUID;

public class Course {

    private String id;

    private String name;

    private String description;

    private LocalDate start;

    private LocalDate end;

    private Course() {

    }

    public Course(String name, String description, LocalDate start, LocalDate end) {
        this.id = UUID.randomUUID().toString();
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
