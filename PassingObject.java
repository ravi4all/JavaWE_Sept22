class Parent {
    
}

class Child_1 extends Parent {
    
}
class Child_2 extends Parent {
    
}
class Child_3 extends Parent {
    
}


public class PassingObject {
    
    static void caller(Parent obj) {
        
    }
    
    public static void main(String[] args) {
        
//        Parent obj = new Child_1();
//        obj = new Child_2();
//        obj = new Child_3();
        
        caller(new Child_1());
        caller(new Child_2());
        caller(new Child_3());
    }

}
