
public class USEmployeeFactory implements EmployeeFactory {

	@Override
	public Developer createDeveloper() {
		return new USDeveloper();
	}

	@Override
	public Manager createManager() {
		return new USManager();
	}

}
