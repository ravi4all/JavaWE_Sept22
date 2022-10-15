public class CustomerInformation {
	int id;
	String name;
	int acc_no;
	String emailId;
	
	void takeInput(int id, String name, int acc_no, String emailId) {
		this.id = id;
		this.name = name;
		this.acc_no = acc_no;
		this.emailId = emailId;
	}
	
	void showCustomer() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Email : " + emailId);
		System.out.println("Acc No : " + acc_no);
	}
}
