import java.text.DecimalFormat;

/**
 * Created by Trey Jenkins on October 21, 2019 at 10:18
 *
 * Objective: use two die to count the number of 7's, 11's and doubles rolled
 */

public class SevenElevenDoubles {

    static final int ROLLS = 100000; // Number of times to roll the die
    static final int RUNS = 3; // Number of times to run the simulation


    static void simulate(Die dieA, Die dieB) {
        int sevenCount = 0, elevenCount = 0, doubleCount = 0; // Create the counter variables

        for (int i = 0; i < ROLLS; i++) {
            // Roll the dice
            int currentRoll = dieA.roll() + dieB.roll();

            // Test results
            if (dieA.getFaceValue() == dieB.getFaceValue()) { // Check for doubles
                doubleCount++;
            } else if (currentRoll == 7) {
                sevenCount++;
            } else if (currentRoll == 11) {
                elevenCount++;
            }
        }

        DecimalFormat df = new DecimalFormat("0.00"); // Create a new Decimal Formatter

        // Print out and calculate the odds of rolling a 7, 11, or doubles
        System.out.println("The odds of rolling a 7, 11, or doubles was " +
                df.format((sevenCount + elevenCount + doubleCount) / (double) ROLLS * 100.0) + "%");

        // Print out and calculate the odds of rolling a 7
        System.out.println("7......: " + sevenCount + " ( " +
                df.format( sevenCount / (double) ROLLS * 100 ) + "% )");
        // Print out and calculate the odds of rolling a 11
        System.out.println("11.....: " + elevenCount + " ( " +
                df.format( elevenCount / (double) ROLLS * 100 ) + "% )");
        // Print out and calculate the odds of rolling doubles
        System.out.println("Doubles: " + doubleCount + " ( " +
                df.format( doubleCount / (double) ROLLS * 100 ) + "% )\n");

    }

    public static void main(String[] args) {
        // Create two new die
        Die dieA = new Die(6);
        Die dieB = new Die(6);

        for (int i = 0; i < RUNS; i++)
            simulate(dieA, dieB);


    }

}
