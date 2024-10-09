package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import employee.Employee;
import sorting.EmployeeComparator;

public class EmployeeSortingDemo {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(904, "Ria"));
        employees.add(new Employee(233, "Tia"));
        System.out.println("sorted by ID:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }	
        Collections.sort(employees, EmployeeComparator.byName());
        System.out.println("sorted by Name:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        Employee cloned = employees.get(0).clone();
        System.out.println("\nCloned Employee: " + cloned);
        System.out.println(cloned);
	
	}
}
