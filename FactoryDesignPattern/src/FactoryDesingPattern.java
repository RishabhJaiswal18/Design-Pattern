import java.util.Scanner;

public class FactoryDesingPattern {

	public static void main(String[] args) {
		System.out.println("Enter the which type of notification you want to send (email/sms/push) = ");
		Scanner scan = new Scanner(System.in);
		String obj = scan.nextLine();
		Notification notify = NotificationFactory.createNotification(obj);
		notify.notifyUser();
	}

}
