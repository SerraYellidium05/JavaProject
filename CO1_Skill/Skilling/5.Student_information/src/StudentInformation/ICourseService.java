package StudentInformation;
import java.util.List;
public interface ICourseService {
	 void addCourse(Course course);
	  Course getCourseById(String id);
	  List<Course> getAllCourses();
	  
}
