
public class Programmer extends Employee {

	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Programmer pro = new Programmer("Leon", "Cannedy", 15);
		System.out.println(pro.getSalary());
	}

	public void createWebsite(String template, String titleName) {
	}

	public void installWindows(String version, String productKey) {
	}

}
