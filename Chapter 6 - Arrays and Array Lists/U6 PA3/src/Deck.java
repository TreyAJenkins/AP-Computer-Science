import java.util.Iterator;
import java.util.Random;

/**
 * Created by Trey Jenkins on February 04, 2020 at 09:07
 */
public class Deck {
    private Card[] deck;
    private int position = 0;
    /**
     * Creates a deck of 52 playing cards to represent every playing
     * card in a regular deck of cards.
     */
    public Deck() {
        createDeck();
        position = 0;
    }
    /**
     * Creates an array of 52 cards to represent every card.
     */
    private void createDeck() {
        deck = new Card[52];
        // Create a random number from 1-13
        Iterator face = new Random().ints(1,14).iterator();
        // Create a random number from 0-3
        Iterator suit = new Random().ints(0,4).iterator();
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card((int)face.next(), (int)suit.next());
        }
    }
    /**
     * Puts all the cards back in the deck.
     * Shuffles a deck of cards in random order.
     * The position of the card goes back to the top.
     */
    public void shuffle() {
        Iterator dest = new Random().ints(0,deck.length).iterator();
        for (int i = 0; i < deck.length; i++) {
            int destination = (int) dest.next();
            Card tmp = deck[i];
            deck[i] = deck[destination];
            deck[destination] = tmp;
        }
        position = 0;
    }
    /**
     * As cards are dealt from the deck, the number of cards left
     * decreases. This function returns the number of cards that
     * are still left in the deck. The return value would be
     * 52 when the deck is first created or after the deck has been
     * shuffled. It decreases by 1 each time the dealCard() method
     * is called.
     * @return the number of cards left in the deck to be dealt.
     */
    public int getNumCardsLeft() {
        return Math.max(0, deck.length - position);
    }
    /**
     * Removes the next card from the deck and return it.
     * @return the next card from the deck
     */
    public Card dealCard() {
        position++;
        return deck[position-1];
    }

}
