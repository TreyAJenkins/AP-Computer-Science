import java.text.DecimalFormat;

/**
 * Created by Trey Jenkins on December 04, 2019 at 02:22
 */
public class AccountCounter {
    // class methods
    private static int numDeposits;
    private static int numWithdraws;
    private static double totalDeposited;
    private static double totalWithdrawn;

    /**
     * Gets the number of deposits
     * @return number of deposits
     */
    public static int getNumDeposits() {
        return numDeposits;
    }

    /**
     * Gets the number of withdrawals
     * @return numWithdraws
     */
    public static int getNumWithdraws() {
        return numWithdraws;
    }

    /**
     * Gets the total deposited
     * @return double of total deposited
     */
    public static double getTotalDeposited() {
        return totalDeposited;
    }

    /**
     * Gets the total withdrawn
     * @return total withdrawn
     */
    public static double getTotalWithdrawn() {
        return totalWithdrawn;
    }

    /**
     * Resets the number of deposits
     */
    public static void resetNumDeposits() {
        AccountCounter.numDeposits = 0;
    }

    /**
     * Resets the number of withdrawals
     */
    public static void resetNumWithdraws() {
        AccountCounter.numWithdraws = 0;
    }

    /**
     * resets the total deposited
     */
    public static void resetTotalDeposited() {
        AccountCounter.totalDeposited = 0;
    }

    /**
     * resets the total withdrawn
     */
    public static void resetTotalWithdrawn() {
        AccountCounter.totalWithdrawn = 0;
    }

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
    public AccountCounter(double initBal, String owner, int number) {
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
            // Increments static variables
            numWithdraws++;
            totalWithdrawn += amount;
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
        // Increments static variables
        numDeposits++;
        totalDeposited += amount;
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
    public void transfer(AccountCounter acct, double amount) {
        if (withdraw(amount))
            acct.deposit(amount);
    }


}
