import java.util.ArrayList;

/**
 * Created by Trey Jenkins on March 05, 2020 at 14:48
 */
public class GolfScore {

    static final int NUM_PLAYERS = 4;
    static final int NUM_HOLES = 9;


    /**
     * Generates a 2D array of random scores
     * @param players amount of players
     * @param holes amount of holes
     * @return 2D array
     */
    static int[][] genRandomScores(int players, int holes) {
        int[][] scoreArray = new int[players][holes];

        for (int i = 0; i < players; i++) {
            for (int v = 0; v < holes; v++) {
                scoreArray[i][v] = (int)(Math.random() * 9) + 1;
            }
        }

        return scoreArray;
    }


    static void print(int[][] scoreArray) {
        // Print the header
        System.out.print("\t\t\t\t ");
        for (int i = 0; i < scoreArray[0].length; i++)
            System.out.print("Hole " + (i+1) + "\t ");
        System.out.println("Total");
        // Print the players scores
        for (int i = 0; i < scoreArray.length; i++) {
            int playerTotal = 0;
            System.out.print("Player " + (i + 1) + ":\t\t");
            for (int v = 0; v < scoreArray[i].length; v++) {
                System.out.print("\t" + scoreArray[i][v] + "\t");
                playerTotal += scoreArray[i][v]; // Add score to player total
            }
            System.out.println("\t" + playerTotal);
        }
        // Calculate the winner for each hole
        System.out.print("Winner:\t\t\t");
        int[] wins = new int[scoreArray.length];
        // Loop through each hole
        for (int i = 0; i < scoreArray[0].length; i++) {
            int holeWinner = -1;
            int holeWinScore = 100;
            for (int v = 0; v < scoreArray.length; v++) {
                if (scoreArray[v][i] < holeWinScore) { // Check if score is lower then current lowest
                    holeWinner = v;
                    holeWinScore = scoreArray[v][i];
                }
            }
            wins[holeWinner]++;
            System.out.print("\t" + (holeWinner+1) + "\t");
        }

        // Find the overall winner
        String winner = "";
        int winAmt = 0;
        for (int i = 0; i < wins.length; i++) {
            if (wins[i] > winAmt) {
                winAmt = wins[i];
                winner = "Player " + (i + 1);
            } else if (wins[i] == winAmt) {
                winner += ", " + (i+1);
            }
        }
        System.out.println("\n\nOverall winner was " + winner);

    }

    public static void main(String[] args) {
        int[][] scoreArray;

        scoreArray = genRandomScores(NUM_PLAYERS, NUM_HOLES);
        print(scoreArray);


    }

}
