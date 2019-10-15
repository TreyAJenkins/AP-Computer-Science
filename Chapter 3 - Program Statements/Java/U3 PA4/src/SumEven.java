import java.util.Scanner;

/**
 * Created by Trey Jenkins on October 15, 2019 at 03:16
 *
 * Objective: find the sum of all even numbers between 2 and the input value
 */

public class SumEven {

    // Returns an integer greater than 2
    static int getValidNumber() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
            System.out.print("Enter a number greater than 2: ");
            input = scanner.nextInt();
        } while (input <= 2);
        scanner.close();

        return input;
    }

    public static void main(String[] args) {
        int counter = 0;
        int max = getValidNumber(); // gets a valid number
        for (int i = 2; i <= max; i = i + 2) { // Iterates over even numbers between 2 and the input
            counter += i;
        }
        System.out.println(counter);
    }
}
