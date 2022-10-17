import java.util.Scanner;

//import department.DeptDetails;

public class EmpCaller {

	public static void main(String[] args) {
		
		// will call default const...
		//EmployeeDetails e1 = new EmployeeDetails();
		
		// will call parameterized const...
		EmployeeDetails e1 = new EmployeeDetails(101, "Ram", 56000, 9087698, "IT");
		//e1.takeInput(101, "Ram", 56000, 9087698, "IT");
		e1.showEmp();
		
		EmployeeDetails e2 = new EmployeeDetails(102, "Raman", 60000, 9087608, "IT");
		//e2.takeInput(102, "Raman", 60000, 9087608, "IT");
		e2.showEmp();
		
//		DeptDetails dt = new DeptDetails();

	}

}
