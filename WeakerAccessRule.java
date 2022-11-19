class A1 {
    private void show() {
        System.out.println("Show Inside A1...");
    }
}

class B1 extends A1 {
    
//    void show() {
//        System.out.println("Show Inside B1...");
//    }
    
//    protected void show() {
//        System.out.println("Show Inside B1...");
//    }
    
    public void show() {
        System.out.println("Show Inside B1...");
    }
}

public class WeakerAccessRule {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
