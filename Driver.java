/**
 * This is the driver class for the program. It contains the main method
 * and is responsible for creating instances of my classes and demonstrating their functionality.
 */
public class Driver {
    public static void main(String[] args) {
        Falcon Jeffrey = new Falcon(5,10, "Jeffrey");
        Jeffrey.fly();
        Jeffrey.protectNest();
        
        PolarBear Eddie = new PolarBear("white", 2000, "Eddie");
        Eddie.rollOver();
        Eddie.sleep();
        Eddie.eat();
        System.out.println(Eddie);
    }
}

