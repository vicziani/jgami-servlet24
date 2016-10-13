package jgami.badges.backend;

import jgami.core.courses.CourseInfo;
import org.springframework.core.convert.converter.Converter;

import java.util.Map;

public class BadgeInfoConverter implements Converter<Badge, BadgeInfo> {

    private Map<Long, CourseInfo> courses;

    public BadgeInfoConverter(Map<Long, CourseInfo> courses) {
        this.courses = courses;
    }

    @Override
    public BadgeInfo convert(Badge badge) {
        return new BadgeInfo(badge.getId(), badge.getName(), badge.getEmail(),
                badge.getCourseId(),
                courses.get(badge.getCourseId()).getName());
    }
}
