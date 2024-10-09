package employee;
import java.util.Iterator;
public class Employee implements Comparable<Employee>,Cloneable,Iterable<Employee>{
	public int id;
	private String name;
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public String getname() {
		return name;
	}
	
	@Override
	public int compareTo(Employee other) {
		return Integer.compare(this.id, other.id);
	}
	
	public Employee clone() {
		try {
		return (Employee) super.clone();
		}
		catch(CloneNotSupportedException e) {
			throw new AssertionError();
		}
		
	}
	
	@Override
	public Iterator<Employee> iterator() {
		return new Iterator<Employee>() {
			private boolean hasmore=true;
			@Override
			public boolean hasNext() {
				return hasmore;
			}
			public Employee next() {
				hasmore = false;
				return Employee.this;
			}
		};
	}
	public String tostring() {
		return id+" "+name;
	}
	
}
