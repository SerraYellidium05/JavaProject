package StudentInformation;
import java.util.ArrayList;
import java.util.List;
public class StudentService  implements IStudentService{
	 private List<Student> students = new ArrayList<>();
	    public void addStudent(Student student) {
	        students.add(student);
	    }
	    public Student getStudentById(String id) {
	        return students.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
	    }
	    public List<Student> getAllStudents() {
	        return students;
	    }

}
