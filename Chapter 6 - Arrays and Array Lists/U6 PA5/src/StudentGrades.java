import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Trey Jenkins on February 08, 2020 at 12:19
 */
public class StudentGrades {
    static final int STOP_SENTINEL = -1;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        int nextInt;

        System.out.print("Enter a grade or " + STOP_SENTINEL + " to quit: ");
        // Loop while the next integer is not the stop sentinel
        while ((nextInt = scanner.nextInt()) != STOP_SENTINEL) {
            arrayList.add(nextInt); // Cast to an Integer and add to the arrayList
            // Setup for the next loop
            System.out.print("Enter a grade or " + STOP_SENTINEL + " to quit: ");
        }

        double average = 0;
        // Add all the grades to average
        for (int grade : arrayList) average += grade;
        average /= arrayList.size(); // Calculate the average

        // Handle no grades in the arrayList
        if (arrayList.size() == 0) average = 0;

        int aboveAverage = 0;
        // Count the number of grades greater than the average, then increment aboveAverage
        for (int grade: arrayList) aboveAverage += (grade > average) ? 1 : 0;

        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("\nThe student's average is: " + df.format(average));
        System.out.println("There were " + aboveAverage + " grades higher than the average.");
    }
}
