class Account_1 {
    String name;
    int acc_no = 121212;
    
    void deposit() {
        System.out.println("Deposit Limit is 100000");
    }
    
    void withdraw() {
        System.out.println("Withdraw Limit is 50000");
    }
}

class CurrentAccount_1 extends Account_1 {
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

class SavingAccount_1 extends Account_1 {
    double balance;
    void roi() {
        System.out.println("ROI is 6%");
    }
    
    @Override
    void deposit() {
        System.out.println("Deposit Limit is 50000");
    }
}

public class IS_A_DemoP3 {
    
    // Polymorphic call
    void caller(Account_1 acc) {
        acc.deposit();
        acc.withdraw();
        // DownCasting
        if(acc instanceof SavingAccount_1) {
            //((SavingAccount_1) acc).roi();
            SavingAccount_1 sa = (SavingAccount_1) acc;
            sa.roi();
        }
        else if(acc instanceof CurrentAccount_1) {
            //((CurrentAccount_1) acc).minBalance();
            CurrentAccount_1 ca = (CurrentAccount_1) acc;
            ca.minBalance();
        }
    }

    public static void main(String[] args) {
        
        IS_A_DemoP3 obj = new IS_A_DemoP3();
        
        // Account acc = new SavingAccount();
        // UpCasting
        obj.caller(new CurrentAccount_1());
        obj.caller(new SavingAccount_1());
        
    }

}
