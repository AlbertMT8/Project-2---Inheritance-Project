/**
 * Represents the model for all talons to be created from
 * The Talon class has a has-a relationship with the Falcon class. Falcons have talons.
 */
public class Talon {
    // The size of the Talon
    private int size;

    /**
     * Constructs a Talon with the specified size.
     *
     * @param size the size of the Talon
     */
    public Talon(int size) {
        this.size = size;
    }

    /**
     * Returns the size of the Talon.
     *
     * @return the size of the Talon
     */
    public int getSize() {
        return size;
    }
}
