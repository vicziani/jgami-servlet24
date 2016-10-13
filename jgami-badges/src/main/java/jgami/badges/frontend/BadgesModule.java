package jgami.badges.frontend;

import jgami.core.common.MenuItem;
import jgami.core.common.Module;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class BadgesModule implements Module {

    @Override
    public String getName() {
        return "Badges";
    }

    @Override
    public List<MenuItem> getMenuItems() {
        return Arrays.asList(
                new MenuItem("badges.menu.badges", "/badges"),
                new MenuItem("badges.menu.request", "/badges/request"));
    }

    @Override
    public String toString() {
        return "BadgesModule{}";
    }
}
