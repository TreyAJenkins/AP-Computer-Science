/**
 * Created by Trey Jenkins on February 04, 2020 at 10:10
 */

public class DeckTester {

    /**
     * Generates a hand and checks for pairs
     * @param deck the deck to draw from
     */
    public static void handy(Deck deck) {
        deck.shuffle();
        Card[] hand = new Card[5];
        int[] faces = new int[14]; // 14 possible face values
        System.out.println("Hand: ");
        for (int i = 0; i < hand.length; i++) { // Count how many of each face value are present
            hand[i] = deck.dealCard();
            System.out.print(hand[i] + "    ");
            faces[hand[i].getFaceValue()]++;
        }
        System.out.println();
        for (int i = 0; i < faces.length; i++) {
            if (faces[i] > 1) {
                System.out.println("There is at least a pair in the hand");
                return;
            }
        }
        System.out.println("There are no pairs in the hand");
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        int count = 0;
        while (deck.getNumCardsLeft() > 0) { // Print out the deck
            System.out.println(deck.dealCard());
            count++;
        }
        System.out.println("Cards printed: " + count);
        System.out.println("Shuffling the deck...");
        deck.shuffle(); // Shuffle
        count = 0;
        while (deck.getNumCardsLeft() > 0) { // Print out the deck again
            System.out.println(deck.dealCard());
            count++;
        }
        System.out.println("Cards printed: " + count);
        deck.shuffle(); // Shuffle
        for (int i = 0; i < 5; i++) handy(deck); // Check for pairs


    }
}
