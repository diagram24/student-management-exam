import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int numCourses = 0;
    private List<String> courses;
    private List<Integer> grades;

    public Student(String name, String address) {
        super(name, address);
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public void addCourseGrade(String course, int grade) {
        courses.add(course);
        grades.add(grade);
        numCourses++;
    }

    public void printGrades() {
        System.out.println(this.toString() + "'s Grades:");
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses.get(i) + ": " + grades.get(i));
        }
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / numCourses;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}
