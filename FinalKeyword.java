//final keyword
//final class cannot be inherited
//O - Open Close Principle

// final can be used at 3 places
//- class, variable, method
//final class - we cannot inherit a final class
//final variable - we cannot modify variable
//final method - we cannot override final methods

//final class X {
//    
//}

class X {
    final void show() {
        
    }
}

class Y extends X {
//    @Override
//    void show() {
//        
//    }
}

public class FinalKeyword {

    public static void main(String[] args) {
       
       X obj = new X();
       //Math.PI++;
       //final int count = 1;
       //count++;

    }

}
