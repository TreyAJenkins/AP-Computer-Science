import java.util.Scanner;

/**
 * Created by Trey Jenkins on September 24, 2019
 * Objective: read in two strings and compare them
 */
public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // initialize the scanner
        System.out.print("Enter the first string: ");
        String uno = scanner.nextLine(); // Read in the first string
        System.out.print("Enter the second string: ");
        String dos = scanner.nextLine(); // Read in the second string

        if (uno.compareTo(dos) < 0) { // Use compareTo to see if uno is less than dos
            // uno is less than dos
            System.out.println("The smaller value of \"" + uno + "\" and \"" + dos + "\" is \"" + uno + "\".");
        } else if (uno.compareTo(dos) > 0) {
            // dos is less than uno
            System.out.println("The smaller value of \"" + uno + "\" and \"" + dos + "\" is \"" + dos + "\".");
        } else {
            // both values are equal
            System.out.println("The values are both \"" + uno + "\".");
        }
    }
}
