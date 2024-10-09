package sorting;

import java.util.Comparator;

import employee.Employee;

public class EmployeeComparator {
	public static Comparator<Employee> byName() {
        return new Comparator<Employee>() {
        	public int compare(Employee e1, Employee e2) {
        		return e1.getname().compareTo(e2.getname());
        	}
        };
    }
}
