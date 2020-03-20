// AP CS - Lab 6.10 - TwoDArrayPractice
/*------------------------------------------
  Resource class TwoDArrayPractice
  Purpose:  2DArray method practice
  Source:  L. Bulk  Feb. 2020
------------------------------------------*/

public class TwoDArrayPractice {

    private int[][] TwoDInt;


    // --------------------------------------
    // create new TwoDArrayPractice object using the given 2D integer array.
    // @param size side length of square array
    // --------------------------------------
    public TwoDArrayPractice(int[][] intArr) {
        TwoDInt = intArr;

    }
    /**
     * Swaps all values in the specified 2 rows of mat.
     * @param rowAIndex the index of a row to be swapped
     * @param rowBIndex the index of a row to be swapped
     */
    public void rowSwap(int rowAIndex, int rowBIndex) {
        // Swap the pointers between rowA and rowB
        int[] OneDInt = TwoDInt[rowAIndex];
        TwoDInt[rowAIndex] = TwoDInt[rowBIndex];
        TwoDInt[rowBIndex] = OneDInt;
    }

    /**
     * Swaps all values in the specified 2 columns of mat.
     * @param colAIndex the index of a column to be swapped
     * @param colBIndex the index of a column to be swapped
     */
    public void colSwap(int colAIndex, int colBIndex) {
        int[] OneDInt = new int[TwoDInt[0].length];
        // Iterate through the rows and swap the columns
        for (int i = 0; i < TwoDInt.length; i++) {
            OneDInt[i] = TwoDInt[i][colAIndex];
            TwoDInt[i][colAIndex] = TwoDInt[i][colBIndex];
            TwoDInt[i][colBIndex] = OneDInt[i];
        }
    }

    /**
     * Returns an array with the specified number of rows and columns
     * containing the characters from str in row-major order. If str.length()
     * is greater than rows * cols, extra characters are ignored. If
     * str.length() is less than rows * cols, the remaining elements in the
     * returned array contain null.
     *
     * @param str the string to be placed in an array
     * @param rows the number of rows in the array to be returned
     * @param cols the number of columsn in the array to be returned
     * @return an array containing the characters from str in row-major order
     */
    public String[][] fillRowMajor(String str, int rows, int cols) {
        String[][] mat = new String[rows][cols];

        // Iterate over the string, stop when string ends or when array is full
        for (int i = 0; i < Math.min(rows * cols, str.length()); i++) {
            int x = (i / cols); // Calculate the row
            int y = (i % cols); // Calculate the column
            mat[x][y] = str.substring(i, i+1);
        }

        return mat;

    }

}