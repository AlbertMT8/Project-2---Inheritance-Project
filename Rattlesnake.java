/**
 * Represents a Rattlesnake, which is a type of Snake.
 */
public class Rattlesnake extends Snake {

    /**
     * The rattle of the rattlesnake.
     */
    private Rattle rattle;

    /**
     * Constructs a new Rattlesnake with the specified scale texture, length, habitat, name, and rattle.
     * The species is set to "rattlesnake" by default.
     *
     * @param scaleTexture the texture of the rattlesnake's scales
     * @param length       the length of the rattlesnake
     * @param habitat      the habitat where the rattlesnake lives
     * @param name         the name of the rattlesnake
     * @param rattle       the rattle of the rattlesnake
     */
    public Rattlesnake(String scaleTexture, float length, String habitat, String name, int rattleScales) {
        super(scaleTexture, length, habitat, name);
        rattle = new Rattle(rattleScales);
    }

    /**
     * Overrides the slither method from the Snake class.
     * Simulates the rattlesnake slithering while loudly rattling its tail.
     */
    @Override
    public void slither() {
        System.out.println(toString() + ". I am slithering while loudly rattling my tail!");
        rattle.rattle(); // Use the rattle's rattle method
    }

}
