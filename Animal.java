/**
 * Represents a generic Animal with properties like species, habitat, and name.
 */
public class Animal {

    /**
     * The species of the animal.
     */
    private String species;

    /**
     * The habitat where the animal lives.
     */
    private String habitat;

    /**
     * The name of the animal.
     */
    private String name;

    /**
     * Constructs a new Animal with the specified species, habitat, and name.
     *
     * @param species the species of the animal
     * @param habitat the habitat where the animal lives
     * @param name    the name of the animal
     */
    public Animal(String species, String habitat, String name) {
        this.species = species;
        this.habitat = habitat;
        this.name = name;
    }

    /**
     * Returns the species of the animal.
     *
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Simulates the animal eating by printing a message to the console.
     */
    public void eat() {
        System.out.println(toString() + " and eating food!");
    }

    /**
     * Returns a string representation of the animal, including species, name, and habitat.
     *
     * @return a string representation of the animal
     */
    public String toString() {
        return "I am a " + species + " named " + name + " living in the " + habitat;
    }

}
