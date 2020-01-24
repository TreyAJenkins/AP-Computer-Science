import java.text.NumberFormat;

/**
 * Created by Trey Jenkins on October 23, 2019 at 10:02
 *
 * Objective: To bank
 */

public class BankAccount {

    private String name; // Name of the account
    private double balance; // Balance of the account

    /**
     * Constructs a BankAccount with a name of ?? and balance of 0.
     */
    public BankAccount() {
        name = "??";
        balance = 0;
    }

    /**
     * Constructs a BankAccount with name of n and balance of bal
     * @param n the name
     * @param bal the balance
     */
    public BankAccount(String n, double bal) {
        name = n;
        balance = bal;
    }

    /**
     * Deposits the amount into the bank account.
     * @param amount the amount
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws the amount from the bank account.
     * @param amount the amount
     */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /**
     * Returns the balance of the bank account
     * @return the balance of the bank account
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the name of the bank account
     * @return the name of the bank account
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the string of the name and balance of the bank account
     */
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return name + " " + nf.format(balance);
    }
}