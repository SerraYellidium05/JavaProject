package StudentInformation;

public class StudentServiceTest {
	private StudentService studentService;
    public void setUp() {
        studentService = new StudentService();
    }
    public void testAddAndGetStudent() {
        Student student = new Student("1", "John Doe");
        studentService.addStudent(student);

        Student fetchedStudent = studentService.getStudentById("1");

        assertNtNull(fetchedStudent);
        assertEquals("John Doe", fetchedStudent.getName());
    }
    private void assertNtNull(Student fetchedStudent) {
				
	}
	public void testGetAllStudents() {
        studentService.addStudent(new Student("1", "John Doe"));
        studentService.addStudent(new Student("2", "Jane Doe"));
        assertEquals(2, studentService.getAllStudents().size());
    }
	private void assertEquals(int i, int size) {
		
	}
	private void assertEquals(String string, String string2) {
			
	}
}
