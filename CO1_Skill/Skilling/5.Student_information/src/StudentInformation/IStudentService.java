package StudentInformation;
import java.util.List;

public interface IStudentService {
	 void addStudent(Student student);
	    Student getStudentById(String id);
	    List<Student> getAllStudents();
}
