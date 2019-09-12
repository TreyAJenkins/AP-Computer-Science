import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Trey Jenkins on September 12, 2019
 *
 * Objective, determine the volume and surface area of a sphere given it's radius
 */

public class Sphere {
    public static void main(String[] args) {
        System.out.print("Enter a radius: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble(); // Read in the radius

        DecimalFormat df = new DecimalFormat("0.####"); // Round to 4 decimal places
        double volume = (4.0/3)*Math.PI*Math.pow(radius, 3); // Calculate the volume
        double area = 4*Math.PI*Math.pow(radius, 2); // Calculate the surface area

        System.out.println("Volume is " + df.format(volume) + " cubic inches");
        System.out.println("Surface Area is " + df.format(area) + " square inches");

        scanner.close();
    }
}
