class Customer {
	
	static int x;
	int y;
	// static block
	static {
		//x = 10;
		// cannot initialize non-static variables
		//y = 12;
		System.out.println("Static block executed...");
	}
	
	// Init Block - will be executed when object of class is created
	// but before constructor call
//	{
//		System.out.println("This is also a block...");
//	}
	
	public Customer() {
		this(10);
		System.out.println("Object Created...");
	}
	
	public Customer(int x) {
		//this();	// will call default constructor...
		System.out.println("Object Created inside parameterized const...");
	}
	
	// Init Block
	{
		//x = 12;
		y = 12;
		System.out.println("This is also a block...");
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Customer obj_1 = new Customer();	// calls default const
		//Customer obj_2 = new Customer(10);	// calls param const

	}

}
