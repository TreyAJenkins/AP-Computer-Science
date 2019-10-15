import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Trey Jenkins on October 15, 2019
 *
 * Objective: Calculates wages
 */

public class Wages {

    // Verifies that the hours worked is between 0 and 168
    static boolean validHours(double hours) {
        return (hours >= 0) && (hours <= 168);
    }

    static double calcEarnings(double hours, double wage) {
        double earnings = 0.0;

        // Return earnings if no overtime is to be calculated
        if (hours <= 40) {
            earnings = hours * wage;
            return earnings;
        }

        // Calculate overtime
        earnings = 40 * wage; // regular pay
        earnings += (hours - 40) * (wage * 1.5); // overtime

        return earnings;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read in the hours worked while validating the input
        double hours = -1;
        while (!validHours(hours)) {
            System.out.print("Enter the number of hours worked this week: ");
            hours = scanner.nextDouble();
        }

        // Read in the wage and validate the input
        double wage = -1;
        while (wage <= 0) {
            System.out.print("Enter your wage: ");
            wage = scanner.nextDouble();
        }

        // Using NumberFormat to format earnings
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("You made " + nf.format(calcEarnings(hours, wage)) + " this week.");
    }

}
