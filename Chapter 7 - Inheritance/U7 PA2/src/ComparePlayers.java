/**
 * Created by Trey Jenkins on January 08, 2020 at 23:35
 */
public class ComparePlayers {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        //Prompt for and read in information for player 1 - using the method from the Player class
        player1.readPlayer();

        //Prompt for and read in information for player 2 - using the method from the Player class
        player2.readPlayer();
        //Compare player1 to player 2 and print a message saying
        //whether they are equal

        if (player1.equals(player2)) {
            System.out.println("Player 1 is equal to Player 2\n");
        } else {
            System.out.println("Player 1 is not equal to Player 2\n");
        }

    }
}
