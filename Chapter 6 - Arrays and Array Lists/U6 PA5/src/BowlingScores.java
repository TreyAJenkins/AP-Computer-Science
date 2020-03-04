import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Trey Jenkins on February 19, 2020 at 08:53
 */
public class BowlingScores {

    static final int STOP_SENTINEL = -999;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        int nextInt;

        System.out.print("Enter a bowling score or " + STOP_SENTINEL + " to quit: ");
        // Loop while the next integer is not the stop sentinel
        while ((nextInt = scanner.nextInt()) != STOP_SENTINEL) {
            arrayList.add(nextInt); // Cast to an Integer and add to the arrayList
            // Setup for the next loop
            System.out.print("Enter a bowling score or " + STOP_SENTINEL + " to quit: ");
        }

        System.out.println("Bowling scores: " + arrayList);

        // Remove invalid bowling scores
        int currPos = 0;
        while (currPos < arrayList.size()) {
            // if 0 < score < 300
            if (arrayList.get(currPos) < 0 || arrayList.get(currPos) > 300) {
                arrayList.remove(currPos);
                currPos = 0;
            }
            currPos++;
        }

        System.out.println("Valid Bowling Scores: ");
        for (int score : arrayList) {
            System.out.print(score + " ");
        }

        double average = 0;
        // Add all the scores to average
        for (int grade : arrayList) average += grade;
        average /= arrayList.size(); // Calculate the average

        // Handle no scores in the arrayList
        if (arrayList.size() == 0) average = 0;

        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("\nAverage score: " + df.format(average));
    }

}
