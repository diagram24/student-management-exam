import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private int numCourses = 0;
    private List<String> courses;

    public Teacher(String name, String address) {
        super(name, address);
        courses = new ArrayList<>();
    }

    public boolean addCourse(String course) {
        if (courses.contains(course)) {
            return false;
        } else {
            courses.add(course);
            numCourses++;
            return true;
        }
    }

    public boolean removeCourse(String course) {
        if (!courses.contains(course)) {
            return false;
        } else {
            courses.remove(course);
            numCourses--;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
}
