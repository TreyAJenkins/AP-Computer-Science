import java.util.Scanner;

/**
 * Created by Trey Jenkins on September 29, 2019
 *
 * Objective: checks to see if a date entered by the user is a valid date
 */

public class DateValidation {

    private static boolean monthValid(int month) {
        return (month > 0 && month < 13); // Checks if month entered is between 1 and 12, inclusive
    }

    private static boolean yearValid(int year) {
        return (year >= 1000 && year <= 1999); // checks if year is between 1000 and 1999
    }

    private static boolean leapYear(int year) {
        // Checks if year is divisible by 400 or if year is divisible by 4 and not 100
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    private static int daysInMonth(int month, boolean isLeapYear) {
        // Check if month is valid
        if (!monthValid(month))
            return 0;

        if (month == 2) { // February, check if leap year
            if (isLeapYear)
                return 29;
            else
                return 28;
        }
        // January, March, May, July, August, October and December all have 31 days
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        // All other months have 30 days
        return 30;
    }

    private static boolean validate(int month, int day, int year) {
        if (!yearValid(year)) // Checks if year is within 1000 and 1999
            return false;
        if (!monthValid(month))
            return false; // Checks if month is between 0 and 13
        if (day < 1 || day > daysInMonth(month, leapYear(year)))
            return false; // Checks if day falls between 0 and the days in the month

        return true;
    }

    private static boolean readDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (MM/DD/YYYY): ");
        String date = scanner.nextLine();
        try { // if date is not formatted correctly, return false
            int month = Integer.parseInt(date.split("/")[0]); // read in the month
            int day = Integer.parseInt(date.split("/")[1]); // read in the day
            int year = Integer.parseInt(date.split("/")[2]); // read in the year

            //System.out.println(month + " / " + day + " / " + year);

            return validate(month, day, year);
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i<7; i++) {
            if (readDate())
                System.out.println("Date valid");
            else
                System.out.println("Date invalid");
        }
    }
}
