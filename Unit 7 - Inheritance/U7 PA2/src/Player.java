import java.util.Scanner;

/**
 * Created by Trey Jenkins on January 05, 2020 at 12:25
 */
public class Player {
    private String name;
    private String team;
    private int jerseyNumber;


    //-----------------------------------------------------------
    // default constructor
    // instance data Strings are set to null
    // instance data ints are set to 0
    //-----------------------------------------------------------
    public Player() {
        name = null;
        team = null;
        jerseyNumber = 0;
    }

    //-----------------------------------------------------------
    // Prompts for and reads in the player's name, team, and
    // jersey number.
    //-----------------------------------------------------------
    public void readPlayer() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Name: ");
        name = keyboard.nextLine();
        System.out.print("Team: ");
        team = keyboard.nextLine();
        System.out.print("Jersey number: ");
        jerseyNumber = keyboard.nextInt();
    }

    @Override
    public boolean equals(Object obj) {
        Player comp = (Player) obj;
        //Compare team names, player names, and jersey numbers
        return (this.name.equals(comp.name)) && (this.team.equals(comp.team)) && (this.jerseyNumber == comp.jerseyNumber);
    }
}
