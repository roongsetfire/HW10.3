
public class CEO extends Employee {
	public CEO(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
	}
	
	public static void main(String[] args) {
		CEO ceo = new CEO("Rudy", "Cib", 24000);
		ceo.hello();
		ceo.fire(ceo);
		System.out.println(ceo.getSalary());
	}
	@Override
	public int getSalary() {
		return super.getSalary() * 2;
	}

	public void hello() {
		System.out.println("Hi, nice to meet you. " + this.firstname + "!");
	}

	public void fire(Employee employee) {
		System.out.println(employee.firstname + " has been fired!");
	}
}
