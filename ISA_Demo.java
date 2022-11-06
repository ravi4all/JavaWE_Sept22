class Account {
	String name;
	int accNo;
	
	void roi() {
		System.out.println("ROI is 6%");
	}
	void withdrawLimit() {
		System.out.println("Withdraw limit is 50000");
	}
}

// Inheritance - inheriting properties of parent class
class SavingAcc extends Account {
	void depositLimit() {
		System.out.println("Deposit limit is 1 Lac");
	}
}

class CurrentAcc extends Account {
	void minBal() {
		System.out.println("Minimum balance must be 10000");
	}
}

public class ISA_Demo {

	public static void main(String[] args) {
		
		SavingAcc sa = new SavingAcc();
		sa.depositLimit();	// belongs to SavingAccount Class
		sa.roi();	// belongs to Account class
		sa.withdrawLimit();	// belongs to Account class
		
		CurrentAcc ca = new CurrentAcc();
		ca.roi();
		ca.withdrawLimit();
		ca.minBal();	// belongs to CurrentAccount Class
		

	}

}
