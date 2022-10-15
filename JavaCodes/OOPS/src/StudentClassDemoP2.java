public class StudentClassDemoP2 {
	
	// class variables
	int rollNo;
	String name;
	double marks;
	String collegeName = "RDE";
	
	// this method will take input and store the values in
	// class variables (rollNo, name and marks)
	void takeInput(int rollNo, String name, double marks) {
		// this refers to the current object of the class
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	// showStudent is the method that will print student details
	// whenever we need to print the details of student then
	// we will call showStudent
	void showStudent() {
		System.out.println("College Name : " + collegeName);
		System.out.println("Roll No : " + this.rollNo);
		System.out.println("Name : " + this.name);
		System.out.println("Marks : " + this.marks);
		System.out.println("==================");
	}
	
	public static void main(String[] args) {
		
		StudentClassDemoP2 ram = new StudentClassDemoP2();
//		ram.rollNo = 101;
//		ram.name = "Ram";
//		ram.marks = 78.45;
		ram.takeInput(101, "Ram", 78.56);
		ram.showStudent();
		
		StudentClassDemoP2 shyam = new StudentClassDemoP2();
//		shyam.rollNo = 102;
//		shyam.name = "Shyam";
//		shyam.marks = 71.45;
		shyam.takeInput(102, "Shyam", 80.45);
		shyam.showStudent();

	}

}
