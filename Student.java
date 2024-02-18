public class Student {
    String name;
    String department;

    public void displayName() {
        System.out.println("--------------------------------");
        System.out.println("Student Name: " + name);
        System.out.println("Student department: " + department);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Nihal Anil Somankoppa";
        s.department = "BCA";
        s.displayName();
        // System.out.println("THE COURCES REGISTERED ARES:");
        // Course studentCourses = new Course();
        // studentCourses.displayStudentMarks();

    }
}