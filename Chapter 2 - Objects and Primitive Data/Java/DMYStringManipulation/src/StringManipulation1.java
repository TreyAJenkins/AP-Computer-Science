/**
 * Created by Trey Jenkins on September 06, 2019
 *
 * Objective: to manipulate strings
 */
public class StringManipulation1 {
    public static void main(String[] args) {
        String word = "Stone Bridge High School"; // Initialize word, as per the prophesy
        System.out.println(word.charAt(4)); // Prints out the character in position 4
        System.out.println(word.length()); // Prints the length of the string
        word = word.concat(" is my school."); // Concatenates to the end of word
        System.out.println(word);
        word = "Because I live in Loudoun County, ".concat(word); // Concatenates to the beginning of word
        System.out.println(word.length()); // Prints the length of the string
        System.out.println(word.substring(23)); // Prints out the substr beginning at pos 23
        System.out.println(word.substring(23, 32)); // Prints out the substr beginning at pos 23 and ending at pos 33
        System.out.println(word.indexOf("school")); // Prints the location of school
        System.out.println(word.indexOf("School")); // Prints the location of School
        word = word.replace('o', 'x'); // Replaces the char 'o' with 'x'
        System.out.println(word);
        word = word.toUpperCase(); // Converts the string to uppercase
        System.out.println(word);
        System.out.println(word.length()); // Prints the length of the string
    }
}
