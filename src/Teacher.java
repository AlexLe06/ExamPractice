import java.util.Objects;

public class Teacher extends User implements Payable {
    private int workExperiences;
    private static double[] salaries = {80208, 82972, 85737, 88502, 91266, 95507, 99748, 103989};

    public Teacher() {
        super();
        this.workExperiences = 0;
    }

    public Teacher(int id, String name, int age, String gender, int workExperiences) {
        super(id, name, age, gender);
        this.workExperiences = workExperiences;
    }

    /**
     * teacher version of report
     * @param title the title of report
     * @param content the content of report
     */
    @Override
    public void report(String title, String content) {
        System.out.printf("Teacher, ID: %s, Name: %s\n" +
                "Title: %s\n" +
                "Content: %s", id, name, title, content);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return workExperiences == teacher.workExperiences;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workExperiences);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "workExperiences=" + workExperiences +
                '}' + super.toString();
    }

    public int getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(int workExperiences) {
        this.workExperiences = workExperiences;
    }

    public static double[] getSalaries() {
        return salaries;
    }

    public static void setSalaries(double[] salaries) {
        Teacher.salaries = salaries;
    }

    /**
     * calculates salary using work experiences
     * @return salary calculated
     */
    @Override
    public double calcSalary() {
        int idx = Math.min(workExperiences, 7); // way faster than doing loop
//        double salary = 0;
//
//        for (double workSalary : salaries)
//            if (workExperiences == workSalary)
//                salary = workSalary;
//
        return salaries[idx];
    }
}
