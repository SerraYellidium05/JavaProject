package StudentInformation;
import java.util.List;
public interface IEnrollmentService {
	 void enrollStudent(Enrollment enrollment);
	    List<Enrollment> getEnrollments();
}
