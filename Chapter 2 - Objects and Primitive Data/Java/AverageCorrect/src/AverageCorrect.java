import java.util.Scanner;

/**
 * Created by Trey Jenkins on September 05, 2019
 *
 * Objective: Calculate averages with using a double instead of an int
 */

public class AverageCorrect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize the scanner

        System.out.print("Enter 1st number: ");
        int uno = scanner.nextInt(); // Read in the first int

        System.out.print("Enter 2nd number: ");
        int dos = scanner.nextInt(); // Read in the second int

        System.out.print("Enter 3rd final number: ");
        int tres = scanner.nextInt(); // Read in the last int

        double average = (uno + dos + tres) / 3.0; // Calculate the average

        System.out.println("The average is " + average);
    }
}
