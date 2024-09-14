package Bike;

public abstract class CreditCardPayment implements PaymentMethod {
	public void processPayment(double amount) {
        System.out.println("Processing credit card payment" + amount);
    }
}
