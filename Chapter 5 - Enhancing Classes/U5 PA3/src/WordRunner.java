import java.util.Scanner;

/**
 * Created by Trey Jenkins on December 02, 2019 at 10:27
 */
public class WordRunner {

    public static void main(String[] args) {
        // Create the scanner
        Scanner scanner = new Scanner(System.in);

        // Read in the words
        System.out.print("Enter the first string: ");
        Word word1 = new Word(scanner.nextLine());

        System.out.print("Enter the second string: ");
        Word word2 = new Word(scanner.nextLine());

        // Compare the two words
        int compare = word1.compareTo(word2);
        if (compare == 0) { // Words are equal
            System.out.println("word 1, \"" + word1 + "\", is the same as word 2, \"" + word2 + "\"");
        } else if (compare < 0) { // Word1 is less than Word2
            System.out.println("word 1, \"" + word1 + "\", is shorter than word 2, \"" + word2 + "\"");
        } else { // Word2 is less than Word1
            System.out.println("word 1, \"" + word1 + "\", is longer than word 2, \"" + word2 + "\"");
        }


    }
}
