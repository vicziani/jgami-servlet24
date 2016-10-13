package jgami.badges.backend;


import java.util.ArrayList;
import java.util.List;

public class BadgeRepository {

    private List<Badge> badges = new ArrayList<>();

    public void save(Badge badge) {
        badges.add(badge);
    }

    public List<Badge> findAll() {
        return new ArrayList<>(badges);
    }
}
