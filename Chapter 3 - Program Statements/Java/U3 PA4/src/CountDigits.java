import java.util.Scanner;

/**
 * Created by Trey Jenkins on October 15, 2019
 *
 * Objective: print the number of even, odd, and zero digits in an int.
 */

public class CountDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read in the integer
        scanner.close(); // Close the scanner

        System.out.print("The number " + number + " has "); // Prints the number before the variable gets modified


        int even = 0, odd = 0, zero = 0; // Keep track of even, odd, and zero digits

        while (number != 0) {
            int digit = number % 10; // Get the last digit

            even += (digit != 0 && digit % 2 == 0) ? 1 : 0; // Increment even if digit is even and not equal to zero.
            odd += (digit % 2 == 0) ? 0 : 1; // Increment odd if digit is not even
            zero += (digit == 0) ? 1 : 0; // Increment zero if digit is equal to zero

            number /= 10; // Shift the current digit
        }

        System.out.println(zero + " zeros, " + even + " evens, and " + odd + " odds.");
    }

}
