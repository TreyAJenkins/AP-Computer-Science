import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Trey Jenkins on January 23, 2020 at 21:08
 */
public class ArraySwap {
    static char[] generateArray(int length) {
        char[] array = new char[length];
        // Create a stream of random numbers representing A to Z
        Iterator random = new Random().ints('A','Z' + 1).iterator();
        // Iterate through the stream and add the random chars to the array
        for (int i = 0; i < array.length; i++) array[i] = (char) (int)random.next();
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of your character array: ");
        int size = scanner.nextInt();
        char[] array = generateArray(size);
        //System.out.println(array);
        // Print the array using a for-each loop
        for (char character : array) {
            System.out.print(character);
        }
        System.out.print("\nEnter an index to swap: (0 - " + (array.length - 1) + "): ");
        int indexA = scanner.nextInt();
        System.out.print("Enter another index to swap: (0 - " + (array.length - 1) + "): ");
        int indexB = scanner.nextInt();

        // Handle indexes outside of the array
        if (!(indexA < array.length && indexA >= 0 && indexB < array.length && indexB >= 0)) {
            System.out.println("Invalid index");
            System.exit(-1);
        }

        System.out.print("\n  Original Array: ");
        for (char character : array) {
            System.out.print(character + " ");
        }

        // Swap the elements
        char tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;

        System.out.print("\nSwapped Elements: ");
        for (char character : array) {
            System.out.print(character + " ");
        }
        System.out.println();
    }
}
