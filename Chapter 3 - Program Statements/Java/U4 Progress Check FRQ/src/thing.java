/**
 * Created by Trey Jenkins on October 17, 2019 at 09:47
 */
public class thing {

    public static void thingstr(String str) {

        int count = 0;
        char character = ' ';

        int tempCount = 0;
        char tempChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (current == character)
                count++;
            else if (current == tempChar)
                tempCount++;
            else {
                tempCount = 1;
                tempChar = current;
            }

            if (tempCount > count) {
                character = tempChar;
                count = tempCount;
                tempCount = 0;
            }
        }

        System.out.println(character + " " + count);

    }

    public static void main(String args[]) {
        thingstr("CCAAAAATTT!");
    }
}
