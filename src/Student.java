import java.util.ArrayList;
import java.util.Objects;

public class Student extends User implements ManageCourse {
    private ArrayList<Course> courses;

    public Student() {
        super();
        this.courses = new ArrayList<>(); //cant put null need to create arraylist
    }

    public Student(int id, String name, int age, String gender, ArrayList<Course> courses) {
        super(id, name, age, gender);
        this.courses = courses;
    }

    /**
     * student version of report
     * @param title the title of report
     * @param content the content of report
     */
    @Override
    public void report(String title, String content) {
        System.out.printf("Student, ID: %s, Name: %s\n" +
                "Title: %s\n" +
                "Content: %s", id, name, title, content);
    }

    /**
     * registers a course if not registered yet
     * @param course the course to register
     * @return the registered course
     */
    @Override
    public boolean register(Course course) {
        if (courses.contains(course)) {
            return false;
        }
        courses.add(course);
        return true;
    }

    /**
     * drops a course if not dropped already
     * @param course the course to drop
     * @return the dropped course
     */
    @Override
    public boolean drop(Course course) {
        if (!courses.contains(course)) { // remember contains could be useful for midterm
            return false;
        }
        courses.remove(course);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(courses
                , student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), courses);
    }

    @Override
    public String toString() { //make sure to add super when creating subclasses
        return "Student{" +
                "courses=" + courses +
                '}' + super.toString();
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
