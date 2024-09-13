package Employees;

public class Main5 {
	public static void main(String[] args) {
		  Employee emp = new Employee("John Doe", "Developer");
	        SalaryCalculator salaryCalculator = new SalaryCalculator();
	        double salary = salaryCalculator.calculateSalary(emp);
	        System.out.println(emp.getName() + "'s salary: $" + salary);
	    }
	}

