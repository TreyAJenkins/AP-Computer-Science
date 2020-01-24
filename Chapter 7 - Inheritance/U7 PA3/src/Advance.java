/**
 * Created by Trey Jenkins on January 11, 2020 at 20:55
 */
public class Advance extends Ticket {

    private int daysInAdvance;

    /**
     * Constructor for advance ticket
     * @param days days in advance
     */
    public Advance(int days) {
        super();
        daysInAdvance = days;
    }

    /**
     * Calculates the price of the ticket
     * @return the price
     */
    @Override
    public double calculatePrice() {
        if (daysInAdvance >= 10) {
            return getPrice() - 20;
        } else if (daysInAdvance >= 1) {
            return getPrice() - 10;
        }
        return getPrice();
    }
}
