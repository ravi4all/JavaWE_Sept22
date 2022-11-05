public class StudentCaller {

	public static void main(String[] args) {
		
		StudentDetails obj_1 = new StudentDetails("Ram", 101, 78.66, 4500.00, (byte)15);
//		obj_1.takeInput("Ram", 101, 78.66, 4500.00, (byte)15);
		//obj_1.fees = 1000.00;
		obj_1.name_1 = "Raam";
		obj_1.setFees(obj_1.getFees() + 1000);
//		obj_1.showStudent();
		// when we print any object than toString() is called...
		System.out.println(obj_1);
//		obj_1.toString()
		//System.out.println(obj_1.hashCode());

	}

}
