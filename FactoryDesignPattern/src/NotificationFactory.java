
public class NotificationFactory {

	public static Notification createNotification(String type) {
		if (type == null || type.isEmpty()) {
			return null;
		}
		switch (type.trim()) {
		case "email":
			return new EmailNotification();

		case "sms":
			return new SMSNotification();

		case "push":
			return new PushNotification();

		default:
			throw new IllegalArgumentException("Unexpexted notification type " + type);
		}
	}
}
