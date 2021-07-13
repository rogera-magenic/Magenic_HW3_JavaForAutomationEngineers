/**
 * TODO FOR HOMEWORK - EquilateralTriangle.java
 *      [X] Update this class to inherit from BaseShape.java
 *      [X] Update to a valid and logical constructor
 *      [X] Override the area method
 *      [X] Override the perimeter method
 *      [X] Add a static main method
 */
public class EquilateralTriangle extends BaseShape{
    /**
     * TODO FOR HOMEWORK: Update the below constructor
     * NOTE: Remember you only need the length (Same thing as the base) to find the height of an equilateral triangle
     *       height = (sqrt(3)/2) * length
     * Creates an instance of the EquilateralTriangle class
     * @param length The base length of the triangle
     */
    public EquilateralTriangle(double length, double height) {
        super("Equilateral Triangle", length, height);
    }

    public EquilateralTriangle(double length) {
        super("Equilateral Triangle", length, Math.sqrt(3) / 2 * length);
    }

    // TODO FOR HOMEWORK: Override the area() method from BaseShape to work for a triangle
    @Override
    public double area() {
        return getLength() * getHeight() / 2;
    }

    // TODO FOR HOMEWORK: Override the perimeter() method from BaseShape to work for a triangle
    @Override
    public double perimeter() {
        return getLength() * 3;
    }

    // TODO FOR HOMEWORK: Add a static main method for any debugging purposes
    public static void main(String[] args) {
        EquilateralTriangle e = new EquilateralTriangle(5);
        e.DEBUG_PrintOutAreaAndPerimeter();
    }
}