//*******************************************************
// Name:
// Date:
//
// ProcessTransactions.java
//
// A class to process deposits and withdrawals for two bank
// accounts for a single day.
//*******************************************************
import java.text.DecimalFormat;
import java.util.Scanner;
public class ProcessTransactions {
    public static void main(String[] args) {
        AccountCounter acct1, acct2; //two test accounts
        char keepGoing = 'y'; //more transactions?
        char action; //deposit or withdraw
        double amount; //how much to deposit or withdraw
        int acctNumber; //which account to access
        //Create two accounts
        acct1 = new AccountCounter(1000, "Sue", 123);
        acct2 = new AccountCounter(1000, "Joe", 456);
        Scanner keyboard = new Scanner(System.in);
        // prints account summaries at the start of the day
        System.out.println("The following accounts are available:\n");
        acct1.printSummary();
        System.out.println();
        acct2.printSummary();
        //This loop accepts one day's transactions.
        while (keepGoing == 'y' || keepGoing == 'Y') {
            //get account number, what to do, and amount
            System.out.print("\nEnter the number of the account you would like to access: ");
            acctNumber = keyboard.nextInt();
            System.out.print("Would you like to make a deposit (D) or withdrawal (W)? ");
            action = keyboard.next().charAt(0);
            System.out.print("Enter the amount: ");
            amount = keyboard.nextDouble();
            if (amount > 0)
                if (acctNumber == acct1.getAcctNum())
                    if (action == 'w' || action == 'W')
                        acct1.withdraw(amount);
                    else if (action == 'd' || action == 'D')
                        acct1.deposit(amount);
                    else
                        System.out.println("Sorry, invalid action.");
                else if (acctNumber == acct2.getAcctNum())
                    if (action == 'w' || action == 'W')

                        acct2.withdraw(amount);
                    else if (action == 'd' || action == 'D')
                        acct2.deposit(amount);
                    else
                        System.out.println("Sorry, invalid action.");
                else
                    System.out.println("Sorry, invalid account number.");
            else
                System.out.println("Sorry, amount must be > 0.");
            System.out.print("\nMore transactions? (y/n)");
            keepGoing = keyboard.next().charAt(0);
        }
        //Print today's totals here
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Number of deposits: " + AccountCounter.getNumDeposits() +
                " ($" + df.format(AccountCounter.getTotalDeposited()) + ")");
        System.out.println("Number of withdrawals: " + AccountCounter.getNumWithdraws() +
                " ($" + df.format(AccountCounter.getTotalWithdrawn()) + ")");
        //Reset to zero and print the reset values
        AccountCounter.resetNumDeposits();
        AccountCounter.resetNumWithdraws();
        AccountCounter.resetTotalDeposited();
        AccountCounter.resetTotalWithdrawn();

        System.out.println("Number of deposits: " + AccountCounter.getNumDeposits() +
                " ($" + df.format(AccountCounter.getTotalDeposited()) + ")");
        System.out.println("Number of withdrawals: " + AccountCounter.getNumWithdraws() +
                " ($" + df.format(AccountCounter.getTotalWithdrawn()) + ")");
    }
}