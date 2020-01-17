import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by Trey Jenkins on January 17, 2020 at 10:08
 */
public class ArrayBasics {
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
        for (int i = 0; i < numbers.length; i++) sum += numbers[i];
        System.out.println("\nSum: " + sum);

        // Print the 2nd element in the array
        System.out.println("The 2nd element is " + numbers[1]);
        // Get the length of the array
        System.out.println("Array length " + numbers.length);

        // Find the smallest value in the array
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) min = Math.min(numbers[i], min);
        System.out.println("Smallest value " + min);

        /**
         * System.out.println("The 5th element is " + number[5]);
         * Causes an error because '5' refers to the 6th element in the array
         * which is out of range for this array.
         */
    }
}
