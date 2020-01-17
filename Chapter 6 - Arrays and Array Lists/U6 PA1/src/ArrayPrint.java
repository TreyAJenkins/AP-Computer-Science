import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Trey Jenkins on January 17, 2020 at 10:28
 */
public class ArrayPrint {
    public static void main(String[] args) {
        double numbers[] = new double[10];
        // Create a stream of random numbers from 1 to 10
        Iterator random = new Random().doubles(0,10.0).iterator();
        // Iterate through the stream and add the random ints to the array
        for (int i = 0; i < numbers.length; i++) numbers[i] = (double) random.next();

        // Print out the values in the array
        for (int i = 0; i < numbers.length; i++) System.out.println(i + ": " + numbers[i]);
        System.out.println("");
        // Print out the values in the array known as 1-10
        for (int i = 0; i < numbers.length; i++) System.out.println(i+1 + ": " + numbers[i]);
        System.out.println("");
        // Print out the values in the array known as 1-10 in reverse
        for (int i = numbers.length-1; i>=0; i--) System.out.println(i+1 + ": " + numbers[i]);

        // Create a scanner
        System.out.print("\nSize of array: ");
        Scanner scan = new Scanner(System.in);
        // Read in from user
        int len = scan.nextInt();
        // Create new array
        double customNumbers[] = new double[len];
        // Iterate through the stream and add the random ints to the array
        for (int i = 0; i < customNumbers.length; i++) customNumbers[i] = (double) random.next();
        // Print out the values in the array starting at 1
        for (int i = 0; i < customNumbers.length; i++) System.out.println(i+1 + ": " + customNumbers[i]);
        System.out.println("");
        // Print out the values in the array starting at 1 in reverse
        for (int i = customNumbers.length-1; i>=0; i--) System.out.println(i+1 + ": " + customNumbers[i]);
    }
}
