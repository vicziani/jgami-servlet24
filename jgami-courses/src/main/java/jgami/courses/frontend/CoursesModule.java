package jgami.courses.frontend;

import jgami.core.common.MenuItem;
import jgami.core.common.Module;

import java.util.Arrays;
import java.util.List;

public class CoursesModule implements Module {

    @Override
    public String getName() {
        return "Course";
    }

    @Override
    public List<MenuItem> getMenuItems() {
        return Arrays.asList(new MenuItem("courses.menu.courses", "/courses"));
    }

    @Override
    public String toString() {
        return "CoursesModule{}";
    }
}
