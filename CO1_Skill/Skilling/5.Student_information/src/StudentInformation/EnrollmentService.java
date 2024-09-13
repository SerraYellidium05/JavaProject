package StudentInformation;
import java.util.ArrayList;
import java.util.List;

public class EnrollmentService  implements IEnrollmentService {
	 private List<Enrollment> enrollments = new ArrayList<>();
	    public void enrollStudent(Enrollment enrollment) {
	        enrollments.add(enrollment);
	    }
	    public List<Enrollment> getEnrollments() {
	        return enrollments;
	    }	

}
