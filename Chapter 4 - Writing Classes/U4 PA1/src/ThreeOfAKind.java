/**
 * Created by Trey Jenkins on October 21, 2019 at 10:01
 *
 * Objective: to use the Die to determine if three of a kind has been rolled
 */


public class ThreeOfAKind {

    static final int ROLLS = 5000; // How many rolls for the simulation

    public static void main(String[] args) {
        Die d4 = new Die(4); // Create a new Die object with 4 faces
        Die d5 = new Die(5); // Create a new Die object with 5 faces
        Die d6 = new Die(6); // Create a new Die object with 6 faces

        int matchRoll = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println(d4.roll() + " " + d5.roll() + " " + d6.roll()); // Roll the die and print their results

            // Check if all three die rolled the same
            if (d4.getFaceValue() == d5.getFaceValue() && d5.getFaceValue() == d6.getFaceValue()) {
                matchRoll++;
            }

        }
        System.out.println("Number of times three of a kind was rolled: " + matchRoll);

        // Run the simulation

        matchRoll = 0; // Reset the match counter to zero
        System.out.println("\nRolling three die " + ROLLS + " times...");

        for (int i = 0; i < ROLLS; i++) {
            // Roll the three die
            d4.roll();
            d5.roll();
            d6.roll();

            // Check if all three die rolled the same
            if (d4.getFaceValue() == d5.getFaceValue() && d5.getFaceValue() == d6.getFaceValue()) {
                matchRoll++;
            }

        }

        System.out.println("Number of times three of a kind was rolled: " + matchRoll);


    }
}
