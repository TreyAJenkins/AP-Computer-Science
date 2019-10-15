import java.util.Scanner;

/**
 * Created by Trey Jenkins on October 15, 2019 at 05:57
 *
 * Objective: to cheat at Rock, Paper, Scissors
 *
 * To win every game, we wait until the player has technically won. However, instead
 * of telling the player that they've won, the computer picks another weapon to either
 * cause a tie, or win.
 */
public class RPSCheater {

    static class GameState {
        int player = 0;
        int computer = 0;

        // Resets the scoreboard
        public void reset() {
            player = 0;
            computer = 0;
        }

        // Checks if there is a winner
        // Returns 0 for no winner, positive for computer, and negative for user
        public int winner() {
            if (computer == 2)
                return 1;
            if (player == 2)
                return -1;
            return 0;
        }
    }

    enum Weapon {
        ROCK, PAPER, SCISSORS; // Define the weapons

        // Compare this weapon to opponents weapon
        // Returns 0 if weapons are equal, 1 if caller wins, -1 if caller loses
        public int compare(Weapon weapon) {
            switch (this) {
                case ROCK:
                    if (weapon == SCISSORS) return 1;
                    if (weapon == PAPER) return -1;
                    return 0;
                case PAPER:
                    if (weapon == ROCK) return 1;
                    if (weapon == SCISSORS) return -1;
                    return 0;
                case SCISSORS:
                    if (weapon == PAPER) return 1;
                    if (weapon == ROCK) return -1;
                    return 0;
            }
            return 0;
        }
    }

    static Weapon prompt() { // Prompt for the users choice of weapon
        Weapon weapon = null;

        System.out.print("1. Rock\n" +
                "2. Paper\n" +
                "3. Scissors\n");

        while (weapon == null) { // Loop until a valid weapon is chosen

            System.out.print("Choose your weapon (1, 2, or 3): ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) { // Assign the user's choice to a weapon
                case 1:
                    weapon = Weapon.ROCK;
                    break;
                case 2:
                    weapon = Weapon.PAPER;
                    break;
                case 3:
                    weapon = Weapon.SCISSORS;
                    break;
                default:
                    System.out.println("Invalid choice\n");
            }
        }
        return weapon;
    }

    static Weapon randomWeapon() {
        int choice = (int) (Math.random() * 3) + 1; // Generates a random number of either 1, 2, or 3
        Weapon weapon = Weapon.ROCK; // Initialize the weapon

        switch (choice) { // Assign the random number to a weapon
            case 1:
                weapon = Weapon.ROCK;
                break;
            case 2:
                weapon = Weapon.PAPER;
                break;
            case 3:
                weapon = Weapon.SCISSORS;
                break;
        }

        return weapon;
    }

    // Returns false if there is a winner
    static boolean battle(GameState gameState) {

        Weapon playerWeapon = prompt(); // prompt the user for their weapon
        Weapon computerWeapon = randomWeapon(); // randomly select a weapon for the computer


        /* Cheater code */
        // Check if player is one point away from winning and has won the round
        if (gameState.player == 1 && playerWeapon.compare(computerWeapon) == 1) {
            // Select a new weapon for the computer until the computer can win or cause a tie
            while (playerWeapon.compare(computerWeapon) == 1) {
                computerWeapon = randomWeapon();
            }
        }
        /* End of cheater code */

        System.out.print("\nChoice..: " + playerWeapon);
        System.out.println("\nComputer: " + computerWeapon);

        int outcome = playerWeapon.compare(computerWeapon); // compare the player's weapon with the computer's
        switch (outcome) {
            case 0:
                System.out.println("Tie!!  Score: " + gameState.player + " - " + gameState.computer + "\n");
                return true;
            case 1: // Player wins that round
                gameState.player++; // Increment player's score
                System.out.println("You win that round!!  Score: " + gameState.player + " - " + gameState.computer);
                break;
            case -1: // Computer won
                gameState.computer++; // Increment the computer's score
                System.out.println("The computer won that round.  Score: " + gameState.player + " - " + gameState.computer);

        }

        // Check to see if there is a winner
        if (gameState.winner() > 0) { // Computer wins
            System.out.println("GAME OVER. You lost.");
            return false;
        }
        if (gameState.winner() < 0) { // User wins
            System.out.println("You Win! Game over!");
            return false;
        }

        System.out.println();

        return true;
    }

    public static void main(String[] args) {
        GameState gameState = new GameState();
        System.out.println("Welcome to Rock, Paper, Scissors.");

        Scanner scanner = new Scanner(System.in);
        boolean playing = true;


        while (playing) {
            while(battle(gameState)); // battle until the round is won
            System.out.print("\nplay again (Y/n)? ");
            // stop playing if user inputs an n
            if (scanner.nextLine().equalsIgnoreCase("n"))
                playing = false;
            System.out.println();
            gameState.reset();
        }




    }
}
