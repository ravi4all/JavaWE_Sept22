//SOLID
//D - DRY - Donot Repeat Yourself
//S - SRP - Single Responsibility Principle

public class Employee {
	
	// Data Members - Member variables of class
	int id;
	String name;
	double salary;
	int phone;
	String department;
	
	void takeInput(int id, String name, double salary, int phone, String department) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.salary = salary;
		this.department = department;
	}
	
	// Method / Member Function
	void showEmp() {
		// Java internally writes this by itself
		System.out.println("Emp ID : " + id);
		System.out.println("Emp Name : " + name);
		System.out.println("Emp Salary : " + this.salary);
		System.out.println("Emp Phone : " + this.phone);
		System.out.println("Emp Department : " + this.department);
		System.out.println("===================");
	}

	public static void main(String[] args) {
		
		Employee emp = new Employee();
//		emp.id = 101;
//		emp.name = "Ram";
//		emp.salary = 50000;
//		emp.phone = 901212;
//		emp.department = "IT";
		emp.takeInput(101, "Ram", 50000, 9012111, "IT");
		emp.showEmp();
		
//		System.out.println("Emp ID : " + emp.id);
//		System.out.println("Emp Name : " + emp.name);
//		System.out.println("Emp Salary : " + emp.salary);
//		System.out.println("Emp Phone : " + emp.phone);
//		System.out.println("Emp Department : " + emp.department);
		
		Employee emp_2 = new Employee();
//		emp_2.id = 102;
//		emp_2.name = "Shyam";
//		emp_2.salary = 55000;
//		emp_2.phone = 901012;
//		emp_2.department = "IT";
		emp_2.takeInput(102, "Raman", 60000, 9015111, "IT");
		emp_2.showEmp();
		
//		System.out.println("Emp ID : " + emp_2.id);
//		System.out.println("Emp Name : " + emp_2.name);
//		System.out.println("Emp Salary : " + emp_2.salary);
//		System.out.println("Emp Phone : " + emp_2.phone);
//		System.out.println("Emp Department : " + emp_2.department);
		
		Employee emp_3 = new Employee();
		emp_3.takeInput(103, "Kunal", 45000, 89897, "HR");
		emp_3.showEmp();
		
	}

}
