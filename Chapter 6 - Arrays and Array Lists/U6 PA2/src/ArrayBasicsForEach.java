import java.util.Iterator;
import java.util.Random;

/**
 * Created by Trey Jenkins on January 23, 2020 at 10:29
 */
public class ArrayBasicsForEach {
    public static void main(String[] args) {
        //int numbers[] = new Random().ints(5, 1,11).toArray();
        int numbers[] = new int[5];
        // Create a stream of random numbers from 1 to 11
        Iterator random = new Random().ints(1,11).iterator();
        // Iterate through the stream and add the random ints to the array
        for (int i = 0; i < numbers.length; i++) numbers[i] = (int) random.next();

        // Print out the values in the array
        for (int i = 0; i < numbers.length; i++) System.out.print(numbers[i] + " ");

        // Add up all the values in the array
        int sum = 0;
        //for (int i = 0; i < numbers.length; i++) sum += numbers[i];
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum: " + sum);

        // Find the smallest value in the array
        int min = numbers[0];
        //for (int i = 1; i < numbers.length; i++) min = Math.min(numbers[i], min);
        for (int num : numbers) {
            min = Math.min(num, min);
        }

        System.out.println("Smallest value " + min);

    }
}
