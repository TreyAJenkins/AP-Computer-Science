/**
 * Created by Trey Jenkins on September 10, 2019
 *
 * Objective: To manipulate strings
 */

public class StringManipulation2 {
    public static void main(String[] args) {
        String string1, string2, string3; // Create the three strings
        string1 = "This is a test.";
        string2 = "For the next sixty seconds we will conduct a test of the " +
                "emergency broadcast system.";
        string3 = "This is only a test.";

        //Find the pos of character 27 in string2
        System.out.println("a. " + string2.substring(27, 28));

        //Append string 3, 2, and 1 to a new string4
        String string4 = string1 + string2 + string3;
        System.out.println("b. " + string4);

        // Check if string2 == string4
        System.out.println("c. string2 == string4: " + string2.equals(string4)); // Uses the equals method

        // Compare string2 to string3
        System.out.println("d. " + string2.compareTo(string3));

        // Create string5
        String string5 = "this is only a test.";
        System.out.println("e. " + string5);

        // Compare string3 to string5 for equality
        System.out.println("f. string3 == string5: " + string3.equals(string5));

        // Compare string3 to string5 to see if they are equal while ignoring case
        System.out.println("g. " + string3.equalsIgnoreCase(string5)); // ignore the case

        // See if the string he appears in string1
        System.out.println("h. " + string3.indexOf("he")); // check if contains using indexOf

        // See if the string he appears in string2
        System.out.println("i. " + string2.indexOf("he"));

        // Replace all occurrences of “he” with “xyzzy” in string2
        string2 = string2.replace("he", "xyzzy");
        System.out.println("j. " + string2); // Replaces he with xyzzy and prints

        // Determine the length of string1
        System.out.println("k. " + string1.length());

        // print string1 from 3rd char to end
        System.out.println("l. " + string1.substring(2));

        // print out string2 from pos 2 to 10
        System.out.println("m. " + string2.substring(2, 10));

    }
}
