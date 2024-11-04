/**
 * Represents a Bird, which is a type of Animal.
 */
public class Bird extends Animal {

    /**
     * The wingspan of the bird in feet.
     */
    private float wingspan; 

    /**
     * Constructs a new Bird with the specified species, habitat, wingspan, and name.
     *
     * @param species  the species of the bird
     * @param habitat  the habitat where the bird lives
     * @param wingspan the wingspan of the bird in feet
     * @param name     the name of the bird
     */
    public Bird(String species, String habitat, float wingspan, String name) {
        super(species, habitat, name);
        this.wingspan = wingspan;
    }

    /**
     * Simulates the bird laying eggs by printing a message to the console.
     */
    public void layEggs() {
        System.out.println("I am a " + getSpecies() + " laying eggs!");
    }

    /**
     * Simulates the bird protecting its nest by printing a message to the console,
     * including its wingspan.
     */
    public void protectNest() {
        System.out.println("I am protecting my nest with my " + wingspan + " foot long wings!");
    }
}
