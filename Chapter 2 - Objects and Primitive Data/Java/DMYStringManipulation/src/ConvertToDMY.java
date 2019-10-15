import java.util.Scanner;

/**
 * Created by Trey Jenkins on September 06, 2019
 *
 * Objective: read in a number of days, and convert to Years, Months, and Days
 */

public class ConvertToDMY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a total number of days: ");

        int totalDays = scanner.nextInt(); // Read in the total number of days

        int years = totalDays / 365; // Calculate days in a year
        int months = (totalDays % 365) / 30; // Calculate the number of months
        int days = (totalDays % 365) % 30; // Calculate number of days

        System.out.println(totalDays + " days have " + years + " years, " + months + " months, and " + days + " days.");

    }
}
