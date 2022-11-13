class Shape {
    void calculate_area() {
        
    }
    
    void printArea() {
        
    }
}

class Rect extends Shape {
    @Override
    void calculate_area() {
        
    }
    
    void takeInput() {
        
    }
}

class Square extends Shape {
    
}

public class AreaCalc {
    
    void caller(Shape obj) {
        obj.calculate_area();
        obj.printArea();
        if(obj instanceof Rect) {
            Rect rect = (Rect)obj;
            rect.takeInput();
        }
    }

    public static void main(String[] args) {
        
        Shape obj = new Rect();
        obj = new Square();

    }

}
