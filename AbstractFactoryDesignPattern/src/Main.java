import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		EmployeeFactory factory;

		String region = "India";
//		System.out.println("Which employee you want to create (India/US) = ");
//		Scanner scan = new Scanner(System.in);
//		String region = scan.nextLine();

		if (region.equalsIgnoreCase("India")) {
			factory = new IndianEmployeeFactory();
		} else {
			factory = new USEmployeeFactory();
		}

		EmployeeService service = new EmployeeService(factory);
		service.showRoles();
	}

}
