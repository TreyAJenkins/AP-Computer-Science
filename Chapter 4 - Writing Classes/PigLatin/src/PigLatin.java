import java.util.Scanner;

/**
 * Created by Trey Jenkins on October 30, 2019 at 17:12
 */
public class PigLatin {

    // Set to true to test with the test cases in the project document
    static final boolean TEST_TRANSLATE = false;

    /**
     * Checks to see if a char is a vowel
     * @param v the character to test
     * @return true if vowel, false if not
     */
    static boolean isVowel(char v) {
        return v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u';
    }

    /**
     * Checks to see if the character is a vowel
     * @param v character to check
     * @param allowY should y be counted as a character
     * @return the vowelness of the character
     */
    static boolean isVowel(char v, boolean allowY) {
        if (allowY && v == 'y')
            return true;
        return isVowel(v);
    }

    /**
     * Checks to see if the word is capitalized
     * @param word the word to test
     * @return true if capitalized
     */
    static boolean isCapitalized(String word) {
        return Character.isUpperCase(word.charAt(0));
    }


    /**
     * Moves the punctuation to the end of the word
     * @param word word to process
     * @return processed word
     */
    static String movePunctuation(String word) {
        String punctuation = "";
        String prePunctuation = "";
        String newWord = "";
        word = word.toLowerCase();


        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (Character.isLetter(currentChar) || Character.isDigit(currentChar)) {
                newWord += currentChar;
            } else {
                punctuation += currentChar;
            }
        }
        return prePunctuation + newWord + punctuation;
    }

    /**
     * Translates a word to pig latin
     * @param word word to translate
     * @return translated word
     */
    static String translate(String word) {
        boolean foundVowel = false;
        int vowelPos = 0;
        boolean capitalize = isCapitalized(word);

        String lword = word.toLowerCase();

        for (int i = 0; i < lword.length(); i++) {

            // Check to see if the current char is a vowel, also checks for the y special case
            if (isVowel(lword.charAt(i), i != 0)) {
                if (!foundVowel) {
                    foundVowel = true;
                    vowelPos = i;
                }

                if (i == 0) // if first character is a vowel
                    return word + "way";
                else if (lword.charAt(i) == 'u' && lword.charAt(i-1) == 'q') { // Check for special case of qu
                    vowelPos++;
                }
            }
        }

        if (!foundVowel)
            return "INVALID";

        String base = word.substring(vowelPos);
        String append = word.substring(0, vowelPos) + "ay";

        word = base + append;
        word = movePunctuation(word);

        if (capitalize) // capitalized the first character
            word = word.substring(0, 1).toUpperCase() + word.substring(1);

        return word;
    }

    /**
     * The main method
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        if (TEST_TRANSLATE) { // Testing with the test cases in the project doc
            System.out.println(translate("food"));
            System.out.println(translate("holly"));
            System.out.println(translate("orange"));
            System.out.println(translate("ppll"));
            System.out.println(translate("square"));
            System.out.println(translate("quarter"));
            System.out.println(translate("yikes"));
            System.out.println(translate("fly"));
            System.out.println(translate("Canada"));
            System.out.println(translate("sports?"));
            System.out.println(translate("Hello!"));
            System.out.println(translate("\"jeep\""));
            System.out.println(translate("\"!!!!who?\""));
            return;
        }
        // init the scanner
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.print("Enter a word to translate: ");
        // Reads a word from the scanner, saves it to 'word', and checks that the user didn't input a 'q'
        while (!( word = scanner.nextLine() ).equals("q") ) {
            System.out.println(word + " -> " + translate(word));
            System.out.print("Enter a word to translate: "); // Sets up the prompt for the next loop
        }
        System.out.println("Exiting...");

    }
}
