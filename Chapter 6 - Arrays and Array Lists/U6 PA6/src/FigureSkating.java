import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Trey Jenkins on March 03, 2020 at 21:59
 */
public class FigureSkating {
    private static final double STOP = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arrayList = new ArrayList<>();


        System.out.print("Enter a skating score (0.25 – 10.0) or " + STOP + " to quit: ");
        double nextDouble;
        // Read in next double and check if it equals STOP
        while ((nextDouble = scanner.nextDouble()) != STOP) {
            if (nextDouble >= 0.25 && nextDouble <= 10.0) {
                arrayList.add(nextDouble); // Add double to arrayList
                System.out.print("Enter a skating score (0.25 – 10.0) or " + STOP + " to quit: ");
            } else {
                System.out.print("Invalid score. Enter a skating score (0.25 – 10.0) or " + STOP + " to quit: ");
            }
        }
        System.out.println(arrayList);

        //Set max and min to first value in arrayList
        double max = arrayList.get(0);
        double min = max;

        //Find the max and min values
        for (int i = 1; i < arrayList.size(); i++) {
            max = Math.max(max, arrayList.get(i));
            min = Math.min(min, arrayList.get(i));
        }

        System.out.println("High Score: " + max + "\tLow Score: " + min);

        //Remove the max and min values
        arrayList.remove(max);
        arrayList.remove(min);

        System.out.println(arrayList);

        //Calculate the average
        double average = 0;
        for (double score:arrayList) {
            average += score;
        }
        if (average != 0) { // prevent division when there's no elements in array
            average /= arrayList.size();
        }

        System.out.println("Score average: " + average);
    }
}
