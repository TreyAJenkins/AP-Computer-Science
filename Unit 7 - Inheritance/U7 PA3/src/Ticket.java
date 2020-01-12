/**
 * Created by Trey Jenkins on January 11, 2020 at 12:33
 */
public abstract class Ticket {
    private int serialNumber; //unique ticket id number
    private static int nextNum = 1;
    private double price;

    /**
     * Constructor for Ticket
     */
    public Ticket()
    {
        serialNumber = getNextSerialNumber();
        price = 80;

    }

    /**
     *@return returns the price for this ticket
     */
    public  double getPrice()
    {
        return price;
    }


    /**
     *calculates the price of the ticket
     *@return returns the new price of the ticket
     */
    public abstract double calculatePrice();

    /**
     *returns a string with information about the ticket
     *@return a String which gives the serial numbe and price of the ticket
     */
    public String toString() {
        return "Number: " + serialNumber + "\nPrice: $" + calculatePrice();
    }

    /**
     *returns a new unique serial number
     *@return returns an integer which gives a unique Serial Number for each ticket.
     */
    private static int getNextSerialNumber() {
        return nextNum++;
    }
}