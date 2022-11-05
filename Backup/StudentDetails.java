//SRP - Single Responsibility Principle

public class StudentDetails {
	// Class Variable / Data Member
	String name_1;
	private int rollNo;
	private double marks;
	private double fees;
	private byte age;
	String collegeName;
	String country;
	
	// Default Constructor
	public StudentDetails() {
		collegeName = "RD";
		country = "India";
	}
		
	public String getName_1() {
		return name_1;
	}

	public void setName_1(String name_1) {
		this.name_1 = name_1;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// Parameterized Constructor
	public StudentDetails(String name_1, int rollNo, double marks, double fees, byte age) {
		this(); // Calling default constructor
		this.name_1 = name_1;
		this.rollNo = rollNo;
		this.marks = marks;
		this.fees = fees;
		this.age = age;
	}
	
//	void showStudent() {
//		// this -> optional, because Java is internally using this.name_1;
//		System.out.println("College is : " + collegeName);
//		System.out.println("Hello : " + name_1);
//		System.out.println("RollNo : " + rollNo);
//		System.out.println("Age : " + age);
//		System.out.println("Fees : " + fees);
//		System.out.println("Marks : " + marks);
//	}
	
	@Override
	public String toString() {
		return name_1;
	}
	
	
}
