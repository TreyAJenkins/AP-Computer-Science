// AP CS - Lab 6.10 - TwoDArrayPractTest
/*------------------------------------------
  Uses TwoDArrayPractice class
  Purpose:  2DArray method practice
  Source:  L. Bulk  Feb. 2020
------------------------------------------*/


import java.util.Arrays;


public class TwoDArrayPractTest
{
    public static void main(String[] args) {
        //Creates a 2D Integer Array
        int[][] twoDInt = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        //Loop to traverse and print out the original 2D Array
        for (int row = 0; row < twoDInt.length; row++) {
            for (int col = 0; col < twoDInt[row].length; col++) {
                System.out.print(twoDInt[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        //Creates a TwoDArrayPractice object using the twoDInt array created above.
        TwoDArrayPractice solution = new TwoDArrayPractice(twoDInt);

        //calls the woDArrayPractice method rowSwap.
        solution.rowSwap(0,2);

        //prints out new values for the 2D Integer Array after using the method.
        for (int row = 0; row < twoDInt.length; row++) {
            for (int col = 0; col < twoDInt[row].length; col++) {
                System.out.print(twoDInt[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        //calls the twoDArrayPractice method rowSwap.
        solution.colSwap(0,2);

        //prints out new values for the 2D Integer Array after using the method.
        for (int row = 0; row < twoDInt.length; row++) {
            for (int col = 0; col < twoDInt[row].length; col++) {
                System.out.print(twoDInt[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        //Creates a 2D array of type String.
        String[][] mat = new String[5][6];

        //Creates a String variable which has less characters than the array can hold.
        String sentence = "I want a snow day!";

        //calls the twoDArrayPractice method rowSwap, using the String variable and size of the row and column for the 2D String array,
        //and setting mat = the return of the method.
        mat = solution.fillRowMajor(sentence, mat.length,mat[0].length);

        //prints out the 2D String Array after using the method.
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                System.out.print(mat[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        //Creates a new String variable which has more characters than the array can hold.
        String longsentence = "We might have to wait for next year to get one!!";

        //calls the twoDArrayPractice method rowSwap, using the String variable and size of the row and column for the 2D String array,
        //and setting mat = the return of the method.
        mat = solution.fillRowMajor(longsentence, 5,6);

        //prints out the 2D String Array after using the method.
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                System.out.print(mat[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println();


    }
}