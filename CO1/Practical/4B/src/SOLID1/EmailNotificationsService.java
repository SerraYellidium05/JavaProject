package SOLID1;

public class EmailNotificationsService implements NotificationService {
	public void notify(String message) {
        System.out.println("Sending email notification: " + message);
    }

}
