package Bike;

public abstract class PaymentFactory {
	public abstract PaymentMethod createPaymentMethod();

    public static PaymentFactory getFactory(String type) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalFactory();
            default:
              System.out.println("Unknown payment method.");
        }
    }

public  abstract PaymentFactory getFactory(String type);
}
class CreditCardFactory extends PaymentFactory {
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }
}

class PayPalFactory extends PaymentFactory {
    public PaymentMethod createPaymentMethod() {
        return new PayPalPayment();
    }
}

