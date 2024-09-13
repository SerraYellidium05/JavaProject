package StudentInformation;
import java.util.ArrayList;
import java.util.List;
public class CourseService implements ICourseService {
	 private List<Course> courses = new ArrayList<>();
	    public void addCourse(Course course) {
	        courses.add(course);
	    }
	    public Course getCourseById(String id) {
	        return courses.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
	    }
	    public List<Course> getAllCourses() {
	        return courses;
	    }

}
