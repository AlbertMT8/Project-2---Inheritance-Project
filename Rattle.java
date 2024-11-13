/**
 * Represents a Rattle, which is a part of a Rattlesnake.
 */
public class Rattle {

    /**
     * The number of scales in the rattle.
     */
    private int scales;

    /**
     * Constructs a new Rattle with the specified number of scales.
     *
     * @param scales the number of scales in the rattle
     */
    public Rattle(int scales) {
        this.scales = scales;
    }

    /**
     * Simulates the rattling sound by printing a message to the console.
     */
    public void rattle() {
        System.out.println("Rattling with " + scales + " scales!");
    }

    /**
     * Returns the number of scales in the rattle.
     *
     * @return the number of scales
     */
    public int getScales() {
        return scales;
    }
}
