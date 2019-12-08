/**
 * Created by Trey Jenkins on December 04, 2019 at 02:11
 */
public class SodaCanTester {
    public static void main(String[] args) {
        // Create 4 SodaCans
        SodaCan sc1 = new SodaCan();
        SodaCan sc2 = new SodaCan(13.2, 10);
        SodaCan sc3 = new SodaCan(20.1, 13.42);
        SodaCan sc4 = new SodaCan(20.1, 13.42);

        // Test SodaCan.toString()
        System.out.println("sc1: " + sc1);
        System.out.println("sc2: " + sc2);
        System.out.println("sc3: " + sc3);
        System.out.println("sc4: " + sc4);

        System.out.println("\nsc2.equals(sc3): " + sc2.equals(sc3));
        System.out.println("sc3.equals(sc4): " + sc3.equals(sc4));
        System.out.println("sc3 == sc4: " + (sc3 == sc4));
    }
}
