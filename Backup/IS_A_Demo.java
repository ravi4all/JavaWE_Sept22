class Bike {
    int speed;
    double avg;
    int engine;
    
    void showDefaultDetails() {
        System.out.println("Speed : " +speed);
        System.out.println("Avg : " + avg);
    }
}

class RacingBike extends Bike{
    boolean selfStart = true;
    int gear = 6;
    
    void showExtraDetails() {
        System.out.println("Racing Bike Features");
        System.out.println("Self Start : " + selfStart);
        System.out.println("Gear : " + gear);
    }
}

class MountainBike extends Bike {
    boolean selfStart = false;
    int gear = 5;
    boolean gps = true;
    void showExtraDetails() {
        System.out.println("Mountain Bike Features");
        System.out.println("Self Start : " + selfStart);
        System.out.println("Gear : " + gear);
        System.out.println("GPS : " + gps);
    }
    
}

public class IS_A_Demo {

    public static void main(String[] args) {
        
        RacingBike b1 = new RacingBike();
        b1.speed = 400;
        b1.engine = 2000;
        b1.avg = 4.5;
        b1.showDefaultDetails();
        b1.showExtraDetails();

    }

}
