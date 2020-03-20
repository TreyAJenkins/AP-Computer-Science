import java.util.Scanner;

/**
 * Created by Trey Jenkins on February 05, 2020 at 17:22
 */
public class ExponentChart {
    /**
     * Creates an array of the exponent chart
     * @param size number of columns for the array
     * @return the array
     */
    static int[][] createArray(int size) {
        int[][] table = new int[10][size];

        // Create the first row and column of the table
        for (int x = 0; x < table[0].length; x++) {
            table[0][x] = x + 1;
        }
        for (int y = 0; y < table.length; y++) {
            table[y][0] = y + 1;
        }

        // Fill in the rest of the table
        for (int y = 1; y < table.length; y++) {
            for (int x = 1; x < table[y].length; x++) {
                table[y][x] = table[y][x-1] * table[y][0];
            }
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of columns for the table: ");
        int size = scanner.nextInt();

        int[][] table = createArray(size);

        // Print the table
        for (int[] y : table) {
            for (int x : y) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
    }
}
