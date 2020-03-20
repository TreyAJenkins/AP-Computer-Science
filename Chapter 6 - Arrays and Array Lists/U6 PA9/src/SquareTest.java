// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if
// each square is magic.
//
// ****************************************************************

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class SquareTest
{
    public static void main(String[] args)throws IOException
    {
        //Scanner is a new class included in JAVA. It is used to read in files and
        //output just like the Keyboard class
        Scanner scan = new Scanner(new File("src/magicStudentData.txt"));

        int count = 1;                 //count which square we're on
        int size = scan.nextInt(); //size of next square


        //Expecting -1 at bottom of input file
        while (size != -1)
        {

            //create a new Square of the given size
            Square square = new Square(size);

            //call its read method to read the values of the square
            square.readSquare(scan);

            System.out.println("\n******** Square " + count + " ********");
            count++;
            //print the square
            square.printSquare();

            //print the sums of its rows
            for (int row = 0; row < size; row++)
                System.out.println("Sum of row "+ (row + 1) + ": "
                        + square.sumRow(row));

            //print the sums of its columns
            for (int col = 0; col < size; col++)
                System.out.println("Sum of column "+ (col + 1) + ": "
                        + square.sumCol(col));

            //print the sum of the main diagonal
            System.out.println("Sum of main diagonal: " + square.sumMainDiag());

            //print the sum of the other diagonal
            System.out.println("Sum of other diagonal: " + square.sumOtherDiag());

            //determine and print whether it is a magic square
            if(square.magic())
                System.out.println("Yes, the square is a magic square!!!");
            else
                System.out.println("No, the square is not a magic square!!!");


            //get size of next square
            size = scan.nextInt();

        }

    }
}