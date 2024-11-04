/**
 * Represents a Mammal, which is a type of Animal.
 */
public class Mammal extends Animal {

    /**
     * The hair color of the mammal.
     */
    private String hairColor;

    /**
     * Constructs a new Mammal with the specified species, habitat, hair color, and name.
     *
     * @param species   the species of the mammal
     * @param habitat   the habitat where the mammal lives
     * @param hairColor the hair color of the mammal
     * @param name      the name of the mammal
     */
    public Mammal(String species, String habitat, String hairColor, String name) {
        super(species, habitat, name);
        this.hairColor = hairColor;
    }

    /**
     * Simulates the mammal sleeping by printing a message to the console.
     */
    public void sleep() {
        System.out.println("I am sleeping on my " + hairColor + " fur!");
    }    
}
