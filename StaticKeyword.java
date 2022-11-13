class CustomerA {
    //static int counter = 100;
    static int counter;
    int id;
    String name;
    double balance;
    
    static {
        counter = 100;
        System.out.println("Static block init...");
    }
    
    public CustomerA(String name, double balance) {
        counter++;
        this.id = counter;
        this.balance = balance;
        this.name = name;
    }
}

public class StaticKeyword {

    public static void main(String[] args) {
        
        CustomerA c1 = new CustomerA("John", 45000.00);
        System.out.println(c1.id + "," + c1.name + "," + c1.balance);
        
        CustomerA c2 = new CustomerA("Shawn", 30000.00);
        System.out.println(c2.id + "," + c2.name + "," + c2.balance);
        
        System.out.println(c1.id + "," + c1.name + "," + c1.balance);
        
        CustomerA c3 = new CustomerA("Max", 35000.00);
        System.out.println(c3.id + "," + c3.name + "," + c3.balance);
        
        System.out.println(c2.id + "," + c2.name + "," + c2.balance);
        
        System.out.println(c1.id + "," + c1.name + "," + c1.balance);

    }

}
