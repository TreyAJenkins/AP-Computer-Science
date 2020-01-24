/**
 * Created by Trey Jenkins on January 23, 2020 at 20:49
 */

public class Accounts {
    public static void main(String[] args) {
        // Create an array for three BankAccounts
        BankAccount[] accounts = new BankAccount[3];

        // Initialize the first two elements
        accounts[0] = new BankAccount("Amy", 1000);
        accounts[1] = new BankAccount("Dr. Who", 1234);

        // Print out each account
        for (BankAccount account : accounts) {
            System.out.println(account);
        }

        // The third account is null because it hasn't been initialized yet

        // Create the third account, Shrek. Everybody always forgets about Rory.
        accounts[2] = new BankAccount("Shrek", 25.03);

        // Print out each account
        for (BankAccount account : accounts) {
            System.out.println(account);
        }

        // Deposit $350 into The Doctor's account
        accounts[1].deposit(350);
        // Withdraw $25 from Shrek's account
        accounts[2].withdraw(25);


        // Loop over the accounts
        for (int i = 0; i < accounts.length; i++)
            System.out.println(i+1 + ": " + accounts[i]);
    }
}

