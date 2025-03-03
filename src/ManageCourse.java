public interface ManageCourse {
    boolean register(Course course); // no need write public and abstract, because useless

    boolean drop(Course course);
}
