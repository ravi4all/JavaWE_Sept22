class P1 {
    int x;
    P1() {
        x = 100;
        System.out.println("P1 Default Const. called...");
    }
    P1(int z) {
        this();
        System.out.println("P1 Param. Const. Called...");
    }
}

class C1 extends P1 {
    int x;
    C1() {
        // to call parent class constructor super() is used
        super(23);    // it is written internally...
        x = 20;
        System.out.println("C1 Const. Called...");
    }
    C1(int x, int y) {
        //super();
        this();
        int n = x + this.x + super.x;
        System.out.println("C1 Param. Const..." + n);
    }
}

public class SuperVsThis {
    public static void main(String[] args) {
        //C1 obj = new C1();
        C1 obj = new C1(4,5);
    }

}
