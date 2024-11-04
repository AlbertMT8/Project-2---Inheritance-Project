/**
 * Represents a Polar Bear, which is a type of Mammal.
 */
public class PolarBear extends Mammal {

    /**
     * The weight of the polar bear.
     */
    private int weight;

    /**
     * Constructs a new PolarBear with the specified hair color, weight, and name.
     * The species is set to "polar bear" and habitat to "Arctic" by default.
     *
     * @param hairColor the hair color of the polar bear
     * @param weight    the weight of the polar bear
     * @param name      the name of the polar bear
     */
    public PolarBear(String hairColor, int weight, String name) {
        super("polar bear", "Arctic", hairColor, name);
        this.weight = weight;
    }

    /**
     * Returns a string representation of the polar bear, including its weight.
     *
     * @return a string representation of the polar bear
     */
    @Override
    public String toString() {
        return super.toString() + " that weighs " + weight;
    }

    /**
     * Simulates the polar bear rolling over by printing a message to the console.
     * Expects a treat in return.
     */
    public void rollOver() {
        System.out.println(toString() + ". I am rolling over! I expect a treat!");
    }

    /**
     * Overrides the eat() method from the Animal class to customize it for polar bears.
     * Simulates the polar bear eating salmon.
     */
    @Override
    public void eat() {
        System.out.println(toString() + " eating salmon!");
    }
}
