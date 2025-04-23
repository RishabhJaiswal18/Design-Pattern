
public class EmployeeService {
	private Developer developer;
	private Manager manager;

	public EmployeeService(EmployeeFactory factory) {
		this.developer = factory.createDeveloper();
		this.manager = factory.createManager();
	}

	public void showRoles() {
		developer.develop();
		manager.manage();
	}

}
