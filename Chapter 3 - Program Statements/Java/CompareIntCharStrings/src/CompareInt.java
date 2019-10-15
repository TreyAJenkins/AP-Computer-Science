import java.util.Scanner;

/**
 * Created by Trey Jenkins on September 24, 2019
 * Objective: Read in two integers and compare them
 */

public class CompareInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Establish the scanner
        System.out.print("Enter first number: ");
        int uno = scanner.nextInt(); // read in the first integer
        System.out.print("Enter second number: ");
        int dos = scanner.nextInt(); // read in the second integer

        if (uno < dos) { // compare the integers
            System.out.print("The smaller value of " + uno + " and " + dos + " is " + uno + ".");
        } else if (uno > dos) {
            System.out.print("The smaller value of " + uno + " and " + dos + " is " + dos +".");
        } else {
            System.out.print("The values are both " + uno);
        }
    }
}
