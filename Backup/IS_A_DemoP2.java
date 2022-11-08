class Account {
    String name;
    int acc_no;
    
    void deposit() {
        System.out.println("Deposit Limit is 100000");
    }
    
    void withdraw() {
        System.out.println("Withdraw Limit is 50000");
    }
}

class CurrentAccount extends Account {
    void minBalance() {
        System.out.println("Min balance must be 5000");
    }
    
    // @Override - annotation - just to tell other developer that
    // we are overriding this method
    @Override
    void withdraw() {
        System.out.println("Withdraw Limit is 35000");
    }
}

class SavingAccount extends Account {
    double balance;
    void roi() {
        System.out.println("ROI is 6%");
    }
    
    @Override
    void deposit() {
        System.out.println("Deposit Limit is 50000");
    }
}

//DRY - Donot Repeat Yourself

public class IS_A_DemoP2 {

    public static void main(String[] args) {
        
//        SavingAccount sa  = new SavingAccount();        
//        sa.deposit();
//        sa.withdraw();
//        sa.roi();
//        
//        CurrentAccount ca = new CurrentAccount();
//        ca.deposit();
//        ca.withdraw();
//        ca.minBalance();
        
        // Object obj = new SavingAccount();
        
        // Object is of SavingAccount, 
        // but type of object is Account(Parent Class)
        // Upcasting - Create object of child class, but type of object is parent class
        // when we do upcasting than we cannot access method of child class, 
        // we can access all methods of parent class and overrided methods in child class
        Account acc = new SavingAccount();
        acc.deposit();  // overrided method of SavingAccount
        acc.withdraw(); // method of Account class
        //acc.roi(); // method of SavingAccount
        
        acc = new CurrentAccount();
        acc.deposit();
        acc.withdraw();
        //acc.minBalance();
        

    }

}
