import java.text.DecimalFormat;

/**
 * Created by Trey Jenkins on December 04, 2019 at 02:22
 */
public class Account {

    // Instance data
    private double balance;
    private String name;
    private int acctNum;

    /**
     * Constructor to initialize balance, owner and account number
     * @param initBal initial balance
     * @param owner owner's name
     * @param number account number
     */
    public Account(double initBal, String owner, int number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    /**
     * Checks to see if balance is sufficient for withdrawal.
     * If so, decrements balance by amount; if not, prints message.
     * @param amount amount to be withdrawn
     * @return true if success
     */
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("Insufficient funds. Account number " + getAcctNum() + " has only " + df.format(getBalance()) + " in it.");
            return false;
        }
    }

    /**
     * Adds deposit amount to balance
     * @param amount value to be deposited
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Returns balance
     * @return account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns account number
     * @return account number
     */
    public int getAcctNum() {
        return acctNum;
    }

    /**
     * Prints account number, name, and balance
     */
    public void printSummary() {
        System.out.println("Account number: " + acctNum);
        System.out.println("Account owner: " + name);
        System.out.printf("Account balance: $%.2f\n", balance);
    }

    /**
     * Transfers money to another account
     * @param acct destination account
     * @param amount amount to transfer
     */
    public void transfer(Account acct, double amount) {
        if (withdraw(amount))
            acct.deposit(amount);
    }


}
