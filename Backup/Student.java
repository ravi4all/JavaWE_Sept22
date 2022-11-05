public class Student {
	
	// Class Variable / Data Member
	String name_1;
	int rollNo;
	double marks;
	double fees;
	byte age;
	
	void takeInput(String name_1, int rollNo, double marks, double fees, byte age) {
		this.name_1 = name_1;
		this.rollNo = rollNo;
		this.marks = marks;
		this.fees = fees;
		this.age = age;
	}
	
	void showStudent() {
		// this -> optional, because Java is internally using this.name_1;
		System.out.println("Hello : " + name_1);
		System.out.println("RollNo : " + rollNo);
		System.out.println("Age : " + age);
		System.out.println("Fees : " + fees);
		System.out.println("Marks : " + marks);
	}

	public static void main(String[] args) {
		// Local Variable
		//String name_2 = "Shyam";
		//System.out.println("Hello : " + name_2);
		
		// Student - Type of Object
		// obj - reference variable
		// new - new memory allocate
		// Student() - Student class constructor
		Student obj_1 = new Student();
//		obj_1.name_1 = "Ram";
//		obj_1.age = 15;
//		obj_1.fees = 4500.00;
//		obj_1.marks = 78.66;
//		obj_1.rollNo = 101;
		obj_1.takeInput("Ram", 101, 78.66, 4500.00, (byte)15);
		obj_1.showStudent();
//		System.out.println("Hello : " + obj_1.name_1);
//		System.out.println("RollNo : " + obj_1.rollNo);
//		System.out.println("Age : " + obj_1.age);
//		System.out.println("Fees : " + obj_1.fees);
//		System.out.println("Marks : " + obj_1.marks);
		
		System.out.println("=========================");
		
		Student obj_2 = new Student();
//		obj_2.name_1 = "Shyam";
//		obj_2.age = 16;
//		obj_2.fees = 4500.00;
//		obj_2.marks = 71.66;
//		obj_2.rollNo = 102;
		obj_2.takeInput("Shyam", 102, 70.16, 4500.00, (byte)16);
//		System.out.println("Hello : " + obj_2.name_1);
//		System.out.println("RollNo : " + obj_2.rollNo);
//		System.out.println("Age : " + obj_2.age);
//		System.out.println("Fees : " + obj_2.fees);
//		System.out.println("Marks : " + obj_2.marks);
		obj_2.showStudent();
		

	}

}
