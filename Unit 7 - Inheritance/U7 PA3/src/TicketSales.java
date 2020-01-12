/**
 * Created by Trey Jenkins on January 11, 2020 at 12:35
 */
public class TicketSales {
    public static void main(String[] args) {
        Ticket w = new Walkup();
        Ticket v = new Walkup();
        Ticket bigAdv = new Advance(15);
        Ticket lilAdv = new Advance(5);
        Ticket bigStuAdv = new StudentAdvance(10);
        Ticket lilStuAdv = new StudentAdvance(1);

        System.out.println("Walkup: " + w);
        System.out.println();
        System.out.println("Walkup: " + v);
        System.out.println();
        System.out.println("Big Advance: " + bigAdv);
        System.out.println();
        System.out.println("Little Advance: " + lilAdv);
        System.out.println();
        System.out.println("Big StudentAdvance: " + bigStuAdv);
        System.out.println();
        System.out.println("Little StudentAdvance: " + lilStuAdv);
    }
}
