
public class Employee {
	public String firstname;
	public String lastname;
	private int salary;

	public Employee() {
		this("Gnome","Dwight",300);
	}
	public Employee(String fname,String lname) {
		this(fname,lname,2000);
	}
	public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;
	}

	public static void main(String[] args) {
		Employee test = new Employee("John", "Crazy", 20000);
		Employee test1 = new Employee("Johny", "Crazyron");
		test.hello();
		System.out.println(test.getSalary());
		test1.hello();
	}

	public void hello() {
		System.out.println("Hello " + firstname);

	}

	public int getSalary() {
		return salary;

	}

}
