/**
 * Represents a Falcon, which is a type of Bird.
 * The Falcon class has a "has-a" relationship with the Talon class.
 */
public class Falcon extends Bird {

    /**
     * The talon of the falcon.
     */
    private Talon myTalon; // initializing an instance variable of type Talon

    /**
     * Constructs a new Falcon with the specified wingspan, talon size, and name.
     * Sets the species to "falcon" and habitat to "Forest" by default.
     *
     * @param wingspan  the wingspan of the falcon in feet
     * @param talonSize the size of the falcon's talon in feet
     * @param name      the name of the falcon
     */
    public Falcon(float wingspan, int talonSize, String name) {
        super("falcon", "Forest", wingspan, name);
        myTalon = new Talon(talonSize);
    }
    
    /**
     * Returns a string representation of the falcon, including its talon size.
     *
     * @return a string representation of the falcon
     */
    public String toString() {
        return super.toString() + " with a talon size of " + myTalon.getSize() + " feet";
    }
    
    /**
     * Simulates the falcon flying by printing a message to the console.
     */
    public void fly() {
        System.out.println(toString() + " that is currently soaring through the sky!");
    }
}
