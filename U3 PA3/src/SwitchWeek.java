import java.util.Scanner;

/**
 * Created by Trey Jenkins on October 15, 2019
 *
 * Objective: read an integer and print out the corresponding day of the week
 */

public class SwitchWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;

        do {
            System.out.print("Enter a number (1 - 7) or 0 to quit: ");
            day = scanner.nextInt(); // Read in from the scanner

            switch (day) {
                case 1: // Sunday
                case 7: // Saturday
                    System.out.println("Weekend!!!");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("Invalid day");
            }
        } while (day != 0); // Loop until a zero is entered

        System.out.println("Goodbye...");
    }

}
