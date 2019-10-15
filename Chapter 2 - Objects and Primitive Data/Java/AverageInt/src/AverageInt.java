import java.util.Scanner;

/**
 * Created by Trey Jenkins on September 04, 2019
 *
 * Objective:
 *      Write an application that prompts the user to enter in three int values. Create and read
 *      three int variables from the user. Calculate their average and store it in an int variable. Print out the
 *      average as an int value.
 */
public class AverageInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize the scanner

        System.out.print("Enter 1st number: ");
        int uno = scanner.nextInt(); // Read in the first int

        System.out.print("Enter 2nd number: ");
        int dos = scanner.nextInt(); // Read in the second int

        System.out.print("Enter 3rd final number: ");
        int tres = scanner.nextInt(); // Read in the last int

        int average = (uno + dos + tres) / 3; // Calculate the average

        System.out.println("The incorrect average is " + average);
    }

}
