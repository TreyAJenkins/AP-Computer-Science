import java.text.DecimalFormat;

/**
 * Created by Trey Jenkins on December 04, 2019 at 02:02
 */
public class SodaCan {

    private double height;
    private Circle circle;

    /**
     * Default constructor for SodaCan
     */
    public SodaCan() {
        this.height = 1;
        this.circle = new Circle();
    }

    /**
     * Two arg constructor for SodaCan
     * @param height height of the SodaCan
     * @param diameter diameter of the SodaCan
     */
    public SodaCan (double height, double diameter) {
        this.height = height;
        this.circle = new Circle(diameter);
    }


    /**
     * Gets the height of the SodaCan
     * @return height of the SodaCan
     */
    public double getHeight() {
        return height;
    }

    /**
     * Calculates the volume of the SodaCan
     * @return volume of the SodaCan
     */
    public double getVolume() {
        return circle.getArea() * getHeight();
    }

    /**
     * Calculates the surface area of the SodaCan
     * @return surface area of the SodaCan
     */
    public double getSurfaceArea() {
        return (2*circle.getArea()) + (circle.getCircumference() * getHeight());
    }

    /**
     * Compares two SodaCan objects
     * @param obj SodaCan to compare
     * @return true if equals
     */
    public boolean equals(Object obj) {
        SodaCan compare = (SodaCan) obj;
        return (getHeight() == compare.getHeight() && getVolume() == compare.getVolume());
    }

    /**
     * Converts the SodaCan class to a string
     * @return String with diameter, height, volume and surface area
     */
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "diameter: " + df.format(circle.getDiameter()) + "\theight: " + df.format(getHeight()) + "\tvolume: " + df.format(getVolume()) + "\tsurface area: " + df.format(getSurfaceArea());

    }
}
