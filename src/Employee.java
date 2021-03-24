
public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	public String position;

	public Employee() {
		this("Gnome", "Dwight", 300, "maneger");
	}

	public Employee(String fname, String lname) {
		this(fname, lname, 2000, "maneger");
	}

	public Employee(String fname, String lname, int sal) {
		this(fname, lname, sal, "maneger");
	}

	public Employee(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;
		position = positionInput;
	}

	public static void main(String[] args) {
		Employee test = new Employee("John", "Crazy", 20000);
		Employee test1 = new Employee("Johny", "Crazyron");
		test.hello();
		System.out.println(test.getSalary());
		test1.hello();

		Employee check = new Employee("dep", "kid", 50, "developer");
		check.checkPosition();
	}

	public void hello() {
		System.out.println("Hello " + firstname);

	}

	public int getSalary() {
		return salary;

	}

	public void checkPosition() {
		System.out.println("My position is " + position);
	}

}
