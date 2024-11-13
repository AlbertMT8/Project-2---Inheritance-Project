/**
 * Represents a Snake, which is a type of Reptile.
 * This class is abstract, meaning it cannot be instantiated directly.
 * Source I learned about abstract classes and their purposes/functions: https://www.w3schools.com/java/java_abstract.asp 
 */
public abstract class Snake extends Reptile {

    /**
     * The length of the snake.
     */
    protected float length;

    /**
     * Constructs a new Snake with the specified scale texture, length, and name.
     * The species is set to "snake" and the habitat is customizable.
     *
     * @param scaleTexture the texture of the snake's scales
     * @param length       the length of the snake
     * @param habitat      the habitat where the snake lives
     * @param name         the name of the snake
     */
    public Snake(String scaleTexture, float length, String habitat, String name) {
        super("snake", habitat, scaleTexture, name);
        this.length = length;
    }

    /**
     * Abstract method for slithering, to be implemented by subclasses.
     * Different snakes may slither in unique ways (e.g., silently, loudly, etc.).
     */
    public abstract void slither();

    /**
     * Overrides the eat() method from the Animal class to customize it for snakes.
     * Simulates the snake eating, but this method can be further customized by subclasses.
     */
    @Override
    public void eat() {
        System.out.println(toString() + " eating its prey!");
    }

    /**
     * Returns a string representation of the snake, including its length.
     *
     * @return a string representation of the snake
     */
    @Override
    public String toString() {
        return super.toString() + " that is " + length + " feet long";
    }
}
