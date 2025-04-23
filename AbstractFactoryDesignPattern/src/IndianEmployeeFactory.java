
public class IndianEmployeeFactory implements EmployeeFactory {

	@Override
	public Developer createDeveloper() {
		return new IndianDeveloper();
	}

	@Override
	public Manager createManager() {
		return new IndianManager();
	}

}
