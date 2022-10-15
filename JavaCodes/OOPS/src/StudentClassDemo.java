//SOLID
// D - DRY - Donot Repeat Yourself

public class StudentClassDemo {
	
	int rollNo;
	String name;
	double marks;
	String collegeName = "RDE";
	
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
		
		StudentClassDemo ram = new StudentClassDemo();
		ram.rollNo = 101;
		ram.name = "Ram";
		ram.marks = 78.45;
		ram.showStudent();
		
//		System.out.println("Roll No : " + ram.rollNo);
//		System.out.println("Name : " + ram.name);
//		System.out.println("Marks : " + ram.marks);
		
		StudentClassDemo shyam = new StudentClassDemo();
		shyam.rollNo = 102;
		shyam.name = "Shyam";
		shyam.marks = 71.45;
		
//		System.out.println("Roll No : " + shyam.rollNo);
//		System.out.println("Name : " + shyam.name);
//		System.out.println("Marks : " + shyam.marks);
		shyam.showStudent();

	}

}
