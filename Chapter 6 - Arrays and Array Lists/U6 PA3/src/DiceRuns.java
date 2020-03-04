/**
 * Created by Trey Jenkins on February 05, 2020 at 16:51
 */
public class DiceRuns {

    static final int TOSSES = 20; // the amount of times to roll the die
    static final int LOOP = 10; // the number of times to loop

    /**
     * Rolls the die and checks for runs
     * @param die die to roll
     */
    static void run(Die die) {
        int[] tosses = new int[TOSSES];

        for (int i = 0; i < TOSSES; i++) {
            tosses[i] = die.roll();
        }

        boolean inRun = false;
        for (int i = 0; i < tosses.length; i++) {
            if (inRun) {
                if (tosses[i] != tosses[i-1]) { // Is this number different from the last
                    inRun = false;
                    System.out.print("\b) "); // Remove the space
                }
            }
            if (!inRun) {
                if ((i+1) < tosses.length && tosses[i] == tosses[i+1]) { // Don't go out of bounds
                    inRun = true;
                    System.out.print("(");
                }
            }
            System.out.print(tosses[i] + " ");
        }
        if (inRun) System.out.print("\b)"); // Print out a final parenthesis if still in run
        System.out.println();
    }

    public static void main(String[] args) {
        Die die = new Die();
        for (int i = 0; i < LOOP; i++)
            run(die);
    }
}
