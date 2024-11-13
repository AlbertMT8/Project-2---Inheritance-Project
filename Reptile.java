/**
 * Represents a Reptile, which is a type of Animal.
 */
public class Reptile extends Animal {

    /**
     * The texture of the reptile's scales (e.g., "smooth", "rough").
     */
    private String scaleTexture; 

    /**
     * Constructs a new Reptile with the specified species, habitat, scale texture, and name.
     *
     * @param species      the species of the reptile
     * @param habitat      the habitat where the reptile lives
     * @param scaleTexture the texture of the reptile's scales
     * @param name         the name of the reptile
     */
    public Reptile(String species, String habitat, String scaleTexture, String name) {
        super(species, habitat, name);
        this.scaleTexture = scaleTexture;
    }

    /**
     * Simulates the reptile shedding its skin by printing a message to the console.
     */
    public void shedSkin() {
        System.out.println("I am shedding my " + scaleTexture + " scales!");
    }

    /**
     * Simulates the reptile camouflaging in its environment by printing a message to the console,
     * including its scale texture.
     */
    public void camouflage() {
        System.out.println("I am camouflaging into my environment with my " + scaleTexture + " scales!");
    }
}
