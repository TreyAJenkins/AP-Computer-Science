import java.util.Scanner;

/**
 * Created by Trey Jenkins on February 05, 2020 at 17:14
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the table: ");
        int size = scanner.nextInt();

        int[][] table = new int[size][size];

        // Create the first row of the table
        for (int x = 0; x < table.length; x++) {
            table[0][x] = x + 1;
        }

        // Fill in the rest of the table
        for (int y = 1; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                table[y][x] = table[y-1][x] + table[0][x];
            }
        }

        // Print the table
        for (int[] y : table) {
            for (int x : y) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
    }
}
