package Employees;

public class SalaryCalculator {
	 public double calculateSalary(Employee employee) {
	        String role = employee.getRole();
	        switch (role) {
	            case "Manager":
	                return 80000;
	            case "Developer":
	                return 60000;
	            case "Intern":
	                return 30000;
	            default:
	                return 40000;
	        }
	    }
}
