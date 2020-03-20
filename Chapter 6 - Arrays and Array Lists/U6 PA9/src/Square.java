import java.util.Scanner;

/**
 * Created by Trey Jenkins on March 15, 2020 at 00:07
 */
public class Square {
    private int[][] square;

    //--------------------------------------
    //create new square of given size
    //@param   size     side length of square array
    //--------------------------------------
    public Square(int size) {
        square = new int [size][size];
    }


    //--------------------------------------
    //return the sum of the values in the given row
    //@param   int    row: row # within square to sum
    //@return  int    sum of elements in row # row
    //--------------------------------------
    public int sumRow(int row) {
        //update method to return sum
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[row][i];
        }
        return sum;
    }


    //--------------------------------------
    //return the sum of the values in the given column
    //@param   int    col: column # within square to sum
    //@return  int    sum of elements in column # col
    //--------------------------------------
    public int sumCol(int col) {
        //update method to return sum
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][col];
        }
        return sum;
    }

    //--------------------------------------
    //@return int   the sum of the values in the main
    //              diagonal (UL to LR)
    //--------------------------------------
    public int sumMainDiag() {
        //update method to return sum
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][i];
        }
        return sum;
    }

    //--------------------------------------
    //@return int   the sum of the values in the other
    //              ("reverse") diagonal (UR to LL)
    //--------------------------------------
    public int sumOtherDiag() {
        //update method to return sum
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][square.length - 1 - i];
        }
        return sum;
    }

    //--------------------------------------
    //@return boolean   true if the square is magic
    //                    (all rows, cols, and diags have same sum),
    //                  false otherwise
    //--------------------------------------
    public boolean magic() {
        //update method to test if square is magic and return true or false
        int sum = sumMainDiag();
        if (sumOtherDiag() != sum) return false; // Check the main and other diagonal
        for (int i = 0; i < square.length; i++) {
            if (sumCol(i) != sum) return false; // Check every column
            if (sumRow(i) != sum) return false; // Check every row
        }

        return true; // Return true if all checks passed
    }

    //--------------------------------------
    //read info into the square from the standard input.
    //@param  Scanner    Scanner object from which we're reading the data.
    //--------------------------------------
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++)
            for (int col = 0; col < square.length; col ++)
                square[row][col] = scan.nextInt();
    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare() {
        System.out.println("The Square is: ");
        for (int row = 0; row < square.length; row++)
        {
            for (int col = 0; col < square.length; col ++)
                System.out.print("\t" + square[row][col]);
            System.out.println();
        }
    }
}
