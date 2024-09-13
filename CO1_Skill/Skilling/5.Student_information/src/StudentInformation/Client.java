package StudentInformation;

public class Client {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();
        Student student1 = new Student("1", "John Doe");
        Student student2 = new Student("2", "Jane Smith");
        studentService.addStudent(student1);
        studentService.addStudent(student2);
        Course course1 = new Course("C101", "Mathematics");
        Course course2 = new Course("C102", "Physics");
        courseService.addCourse(course1);
        courseService.addCourse(course2);
        enrollmentService.enrollStudent(new Enrollment(student1, course1));
        enrollmentService.enrollStudent(new Enrollment(student1, course2));
        enrollmentService.enrollStudent(new Enrollment(student2, course1));
        System.out.println("Courses for " + student1.getName() + ":");
        for (Course course : student1.getCourses()) {
            System.out.println("- " + course.getName());
        }
        System.out.println("Courses for " + student2.getName() + ":");
        for (Course course : student2.getCourses()) {
            System.out.println("- " + course.getName());
        }
    }
}


