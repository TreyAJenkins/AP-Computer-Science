/**
 * Created by Trey Jenkins on September 12, 2019
 *
 * Objective: To generate a random phone number
 */
public class PhoneNumber {
    private static String areaCodeGenerator() {
        String areaCode;

        int d1 = (int)(Math.random() * 6 + 2); // Generate the first digit, excluding 0, 1, 8, 9
        int d2 = (int)(Math.random() * 8); // Generate the second digit excluding 8 and 9
        int d3 = (int)(Math.random() * 8); // Generate the third digit excluding 8 and 9

        areaCode = "(" + d1 + d2 + d3 + ")";

        return areaCode;
    }

    private static String prefixGenerator() {
        String prefix;

        int d1 = (int)(Math.random() * 6 + 2); // Generate the first digit, excluding 0, 1, 8, and 9
        int d2 = (int)(Math.random() * 4); // Generate a second digit from 0 to 4
        int d3 = (int)(Math.random() * 2); // Generate a third digit from 0 to 2

        prefix = "" + d1 + d2 + d3;
        return prefix;
    }

    private static String lineGenerator() {
        String line;
        int d4 = (int)(Math.random()*10000); // Generate a random number
        line = String.format("%04d", d4); // Format string with leading zeros
        return line;
    }

    private static String numberGenerator(String areaCode, String prefix, String line) {
        return areaCode + " " + prefix + " - " + line;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            //Generate a phone number and print it out
            System.out.println(numberGenerator(areaCodeGenerator(), prefixGenerator(), lineGenerator()));
        }
    }
}
