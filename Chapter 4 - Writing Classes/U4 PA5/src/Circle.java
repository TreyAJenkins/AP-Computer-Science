import java.text.DecimalFormat;

/**
 * Created by Trey Jenkins on November 13, 2019 at 10:25
 */
public class Circle {

    private double diameter;

    /**
     * Default constructor with a diameter of 1
     */
    public Circle() {
        diameter = 1;
    }

    /**
     * Constructor to create a circle
     * @param diameter diameter of the circle
     */
    public Circle(double diameter) {
        this.diameter = diameter;
    }

    /**
     * Calculates the area of the circle
     * @return the area
     */
    public double getArea() {
        return Math.PI * (diameter / 2) * (diameter / 2);
    }

    /**
     * Calculates the circumference of the circle
     * @return the circumference
     */
    public double getCircumference() {
        return Math.PI * diameter;
    }

    /**
     * Returns the diameter of the circle
     * @return diameter
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Compares two circles
     * @param obj Circle to compare with
     * @return true if equal, false if not
     */
    public boolean equals(Object obj) {
        return (this.diameter == ((Circle) obj).diameter); // Casts obj to Circle
    }

    /**
     * Converts the Circle class to a string
     * @return String of diameter, area and circumference.
     */
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "diameter: " + df.format(getDiameter()) + "\tarea: " + df.format(getArea()) + "\tcircumference: " + df.format(getCircumference());
    }
}
