package Employees;

public class Main9 {

	public static void main(String[] args) {
		 MyApplication app1 = new MyApplication(new EmailService());
	        app1.processMessages("Hello, John!", "john@example.com");
	        MyApplication app2 = new MyApplication(new SMSService());
	        app2.processMessages("Hello, Jane!", "555-1234");
	}

}
