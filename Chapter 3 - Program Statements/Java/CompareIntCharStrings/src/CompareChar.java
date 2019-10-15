import java.util.Scanner;

/**
 * Created by Trey Jenkins on September 24, 2019
 * Objective: Read in two chars and compare them
 */

public class CompareChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Establish the scanner
        System.out.print("Enter first char: ");
        String uno = scanner.next(); // read in the first char
        System.out.print("Enter second char: ");
        String dos = scanner.next(); // read in the second char

        // Convert to char
        char unoChar = uno.charAt(0);
        char dosChar = dos.charAt(0);

        if (unoChar < dosChar) { // compare the chars
            System.out.print("The smaller value of '" + unoChar + "' and '" + dosChar + "' is " + unoChar + "'.");
        } else if (unoChar > dosChar) {
            System.out.print("The smaller value of '" + unoChar + "' and '" + dosChar + "' is " + dosChar + "'.");
        } else {
            System.out.print("The values are both '" + unoChar + "'.");

        }
    }
}
