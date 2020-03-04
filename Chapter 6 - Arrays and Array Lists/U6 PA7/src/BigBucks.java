import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Trey Jenkins on March 04, 2020 at 08:33
 */
public class BigBucks {

    public static void main(String[] args) {

        //Declare and instantiate an empty ArrayList that will hold BankAccount objects.
        ArrayList<BankAccount> accounts = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter new names and balances until they're done.
        System.out.print("Please enter the name to whom the account belongs. (“Q” to quit): ");
        String currName;
        while (!(currName = scanner.nextLine()).equalsIgnoreCase("Q")) { // While the next line does not equal Q
            System.out.print("Please enter the amount of the deposit: ");
            double currDeposit = scanner.nextDouble();
            // Create a new bank account
            BankAccount account = new BankAccount(currName, currDeposit);
            // Add the bank account to the arrayList
            accounts.add(account);
            // Setup for the next loop
            System.out.print("Please enter the name to whom the account belongs. (“Q” to quit): ");
            scanner.nextLine();
        }

        if (accounts.size() > 0) {
            double maxAmt = accounts.get(0).getBalance();
            String maxName = accounts.get(0).getName();
            // Find the bank account with the most money
            for (BankAccount account : accounts) {
                if (account.getBalance() > maxAmt) {
                    maxAmt = account.getBalance();
                    maxName = account.getName();
                }
            }
            System.out.println("The account with the largest balance belongs to " + maxName + ".");
            // Setup a decimal formatter
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("The amount is $" + df.format(maxAmt) + ".");
        }
    }
}
