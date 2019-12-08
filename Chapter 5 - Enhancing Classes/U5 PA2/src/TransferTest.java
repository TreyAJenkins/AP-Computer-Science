import java.util.Scanner;

/**
 * Created by Trey Jenkins on December 04, 2019 at 02:32
 */
public class TransferTest {

    static void transfer(Scanner scanner, Account from, Account to) {
        System.out.print("Enter amount to transfer: ");
        double amount = new Double(scanner.nextLine());
        if (amount < 0) {
            System.out.println("\nInvalid amount entered. Must be greater than zero. Try again.\n");
            transfer(scanner, from, to);
        } else
            from.transfer(to, amount);
    }

    static void prompt(Scanner scanner, Account acct1, Account acct2) {
        acct1.printSummary();
        acct2.printSummary();

        System.out.print("Enter 12 (transfer from rich->poor), 21 (transfer from poor->rich), or (q)uit: ");

        switch (scanner.nextLine()) {
            case "12":
                transfer(scanner, acct1, acct2);
                prompt(scanner, acct1, acct2);
                break;
            case "21":
                transfer(scanner, acct2, acct1);
                prompt(scanner, acct1, acct2);
                break;
            case "q":
                acct1.printSummary();
                acct2.printSummary();
                return;
            default:
                System.out.println("\nInvalid action\n");
                prompt(scanner, acct1, acct2);
        }

    }

    public static void main(String[] args) {
        Account rich = new Account(1000000, "Rich", 123);
        Account poor = new Account(1, "Poor", 456);

        Scanner scanner = new Scanner(System.in);
        prompt(scanner, rich, poor);
    }
}
