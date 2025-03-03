import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class School {
    private ArrayList<User> users;

    public School() {
        this.users = new ArrayList<>();
    }

    public School(ArrayList<User> users) {
        this.users = users;
    }

    /**
     * exports user data into a csv file
     * @param fileName the name of file
     */
    public void export(String fileName) { //since its like printing it is void
        File file = new File(path); //make sure to remember and study this

        try (FileWriter fileWriter = new FileWriter(file)) {
            for (User user : users) {
                fileWriter.write(user.getId() + ", ");
                fileWriter.write(user.getName() + ", ");
                fileWriter.write(user.getAge() + ", ");
                fileWriter.write(user.getGender() + ", ");

                if (user instanceof Student student) {
                    ArrayList<Course> courses = student.getCourses();
                    for (Course course : courses) {
                        fileWriter.write(course.getName() + ", ");
                    }
                    fileWriter.write("\n");
                } else if (user instanceof Teacher teacher) {
                    fileWriter.write(teacher.getWorkExperiences() + "\n");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(users, school.users);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(users);
    }

    @Override
    public String toString() {
        return "School{" +
                "users=" + users +
                '}';
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
