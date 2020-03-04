/**
 * Created by Trey Jenkins on November 13, 2019 at 09:26
 */
public class Card {

    private int faceValue; // the numeric value of the card (1 – 13 → A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K)
    private int suit; // the numeric value of the suit (0 – 3)
    public static final int CLUBS = 0, DIAMONDS = 1, HEARTS = 2, SPADES = 3;
    public static final int ACE = 1, JACK = 11, QUEEN = 12, KING = 13;

    /**
     * Constructor to create a card
     * @param value face value of the card
     * @param s card suit
     */
    public Card(int value, int s) {
        faceValue = value;
        suit = s;
    }

    /**
     * Gets the face value of the card
     * @return card face value
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Gets the suit name of the card
     * @return name of the suit
     */
    public String getSuit() {
        switch (suit) {
            case CLUBS:
                return "Clubs";
            case DIAMONDS:
                return "Diamonds";
            case HEARTS:
                return "Hearts";
            case SPADES:
                return "Spades";
        }
        return "";
    }

    /**
     * Tests if two cards are equal
     * @param candidate Card to test against
     * @return true if equal, false if not
     */
    public boolean equals(Card candidate) {
        return (suit == candidate.suit && faceValue == candidate.faceValue);
    }

    /**
     * Convert the Card into a string
     * @return the face value and the suit
     */
    public String toString() {
        // Determine the name of the face value of the card
        String face = "";
        if (faceValue > ACE && faceValue < JACK) { // Just a number
            face = faceValue + "";
        } else {
            switch (faceValue) { // Finds the name
                case ACE:
                    face = "Ace";
                    break;
                case JACK:
                    face = "Jack";
                    break;
                case QUEEN:
                    face = "Queen";
                    break;
                case KING:
                    face = "King";
            }
        }
        return face + " of " + getSuit();
    }
}