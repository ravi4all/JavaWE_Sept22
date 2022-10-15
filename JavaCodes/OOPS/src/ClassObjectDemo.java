public class ClassObjectDemo {
	// Data Members : variables defined inside a class
	int rollNo;
	String name;
	static double marks;
	// these variables can only be accessed after creating object of class
	
	public static void main(String[] args) {
		// creating object of the class
		// ClassObjectDemo - type of object
		// obj is the reference variable
		// new - reserved keyword : used to allocate new memory to object
		// ClassObjectDemo() - Constructor, used to create object of class
		// every class has a default constructor that has same name as class name
		ClassObjectDemo obj = new ClassObjectDemo();
		
//		marks = 123;
//		name = "Shyam";
		
		// assign values to the variables inside the class using object
		obj.rollNo = 101;
		obj.name = "Ram";
		obj.marks = 78;
		System.out.println(obj.name);
		System.out.println(obj.rollNo);
		System.out.println(obj.marks);

	}

}
