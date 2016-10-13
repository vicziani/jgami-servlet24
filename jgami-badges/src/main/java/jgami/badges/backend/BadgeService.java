package jgami.badges.backend;

import jgami.core.courses.CourseInfo;
import jgami.core.courses.CourseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class BadgeService {

    private BadgeRepository badgeRepository;

    private CourseInfoService courseInfoService;

    @Autowired
    public BadgeService(BadgeRepository badgeRepository, CourseInfoService courseInfoService) {
        this.badgeRepository = badgeRepository;
        this.courseInfoService = courseInfoService;
    }

    public List<BadgeRequestInfo> listBadgeRequests() {
        BadgeRequestInfoConverter badgeRequestInfoConverter =
                new BadgeRequestInfoConverter(getCourses());

        return badgeRepository.findAll().stream().map(
                b -> badgeRequestInfoConverter.convert(b))
                .collect(Collectors.toList());
    }

    private Map<String, CourseInfo> getCourses() {
        return courseInfoService.listCourses().stream().collect(
                Collectors.toMap(courseInfo -> courseInfo.getId(), Function.identity())
        );
    }

    public void requestBadge(BadgeRequest badgeRequest) {
        Badge badge = new Badge(badgeRequest.name,
                badgeRequest.email, badgeRequest.courseId);
        badgeRepository.save(badge);
    }

    public List<CourseInfo> listCourses() {
        return courseInfoService.listCourses();
    }

}
