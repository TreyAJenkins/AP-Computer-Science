/**
 * Created by Trey Jenkins on January 11, 2020 at 20:59
 */
public class StudentAdvance extends Advance {
    /**
     * Constructor for student advance ticket
     * @param days days in advance
     */
    public StudentAdvance(int days) {
        super(days);
    }

    /**
     * Calculates what half of a regular advance ticket would cost
     * @return calculated price
     */
    @Override
    public double calculatePrice() {
        return super.calculatePrice() / 2;
    }

    @Override
    public String toString() {
        return super.toString() + "\n*Student ID required to purchase*";

    }
}
