/**
 * Created by Trey Jenkins on October 23, 2019 at 10:14
 *
 * Objective: To test the BankAccount class
 */

public class BankAccountTester {

    public static void main(String[] args) {

        System.out.println("1st Account");
        BankAccount bank1 = new BankAccount(); // Create the first bank account
        bank1.deposit(375); // Deposit $375
        System.out.println(bank1.toString()); // Print the account out using the toString method
        System.out.println("Balance: " + bank1.getBalance());

        System.out.println("\n2nd Account");
        BankAccount bank2 = new BankAccount("Jaundiced Jimmy", 1000); // Create the second bank account
        bank2.deposit(609.22); // Deposit $609.22 into the account
        bank2.withdraw(200); // Withdraw $200
        System.out.println(bank2);
        System.out.println("Name: " + bank2.getName());

    }

}
