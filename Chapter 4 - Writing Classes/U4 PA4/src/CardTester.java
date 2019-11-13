/**
 * Created by Trey Jenkins on November 13, 2019 at 10:04
 */
public class CardTester {
    public static void main(String[] args) {
        // Print all the cards
        System.out.println("Loop over all possible cards");
        for (int i = 1; i < 14; i++) { // for loop for the face value
            for (int v = 0; v < 4; v++) { // for loop for the suit
                Card testLoop = new Card(i, v); // create a card with the chosen face value and suit
                System.out.println("\t" + testLoop);
            }
        }

        // Test getFaceValue and getSuit
        System.out.println("\nTest getFaceValue and getSuit methods");
        Card testGet = new Card(1,3);
        System.out.println("\t" + testGet.getFaceValue());
        System.out.println("\t" + testGet.getSuit() + "\n");

        // Test equals method with unequal cards
        System.out.println("Testing equals method, different value");
        Card testNotEquals = new Card(12, 2);
        System.out.println("\t(" + testGet + ").equals(" + testNotEquals + ")  |  " +
                testGet.equals(testNotEquals) + "\n");

        // Test equals method with equal cards
        System.out.println("Testing equals method, same value");
        Card testEquals = new Card(1, 3);
        System.out.println("\t(" + testGet + ").equals(" + testEquals + ")  |  " +
                testGet.equals(testEquals) + "\n");

        // Testing equality using an invalid method
        System.out.println("Testing equality using an invalid method");
        System.out.println("\t" + testGet + " == " + testEquals + "  |  " +
                (testGet == testEquals) + "\n");
    }
}
