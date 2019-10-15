import java.util.Scanner;

/**
 * Created by Trey Jenkins on October 15, 2019 at 04:20
 *
 * Objective: determine how many vowels, consonants, spaces, and “other characters” are in a string.
 */

public class CountVowels {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String str = scanner.nextLine().toLowerCase(); // Read in a string and convert to lower case
        scanner.close();

        int charA = 0, charE = 0, charI = 0, charO = 0, charU = 0; // Define the vowel counters
        int consonants = 0, spaces = 0, other = 0;

        for (int i = 0; i < str.length(); i++) { // Iterate through the string
            char c = str.charAt(i);
            switch (c) {
                // Test for vowels
                case 'a':
                    charA++;
                    break;
                case 'e':
                    charE++;
                    break;
                case 'i':
                    charI++;
                    break;
                case 'o':
                    charO++;
                    break;
                case 'u':
                    charU++;
                    break;
                // Test for spaces
                case ' ':
                    spaces++;
                    break;
                // Test for consonants and other characters
                default:
                    if (Character.isLetter(c)) // All letters that are not vowels are consonants
                        consonants++;
                    else // Character isn't a letter or a space
                        other++;

            }
        }

        // Print out the results
        System.out.println("The number of 'a': " + charA);
        System.out.println("The number of 'e': " + charE);
        System.out.println("The number of 'i': " + charI);
        System.out.println("The number of 'o': " + charO);
        System.out.println("The number of 'u': " + charU);
        System.out.println("The number of consonants: " + consonants);
        System.out.println("The number of spaces: " + spaces);
        System.out.println("The number of other characters: " + other);



    }

}
