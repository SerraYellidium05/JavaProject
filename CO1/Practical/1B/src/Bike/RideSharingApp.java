package Bike;

public class RideSharingApp {
	public static void main(String[] args) {
		Authentication auth = Authentication.getInstance();
        auth.login("user1", "password123");
        if (auth.isAuthenticated()) {
          VehicleFactory vehicleFactory = new CarFactory();
          Vehicle vehicle = vehicleFactory.getVehicle();
          vehicle.ride();
           PaymentFactory paymentFactory = new CreditCardFactory();
           PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
           ((Object) paymentMethod).processPayment(25.0);
        }
        auth.logout();
    }
}

