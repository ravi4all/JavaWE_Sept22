public class EmployeeDetails {
	// Data Members - Member variables of class
	int id;
	String name;
	double salary;
	int phone;
	String department;
	String companyName;
	
	// now this is the default constructor
	public EmployeeDetails() {
		companyName = "INFY";
		System.out.println("New Object Created...");
	}
	
	public EmployeeDetails(String name) {
		this();
		System.out.println("New Object of : " + name + " created...");
	}
	
	// Parameterized Constructor
	public EmployeeDetails(int id, String name, double salary, int phone, String department) {
		// Constructor Chaining - will call default constructor
		this(name);
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.salary = salary;
		this.department = department;
	}
	
//	void takeInput(int id, String name, double salary, int phone, String department) {
//		// initializing variables
//		this.id = id;
//		this.name = name;
//		this.phone = phone;
//		this.salary = salary;
//		this.department = department;
//	}
	
	// Method / Member Function
	void showEmp() {
		// Java internally writes this by itself
		System.out.println("Welcome to : "+companyName);
		System.out.println("Emp ID : " + id);
		System.out.println("Emp Name : " + name);
		System.out.println("Emp Salary : " + this.salary);
		System.out.println("Emp Phone : " + this.phone);
		System.out.println("Emp Department : " + this.department);
		System.out.println("===================");
	}

}
