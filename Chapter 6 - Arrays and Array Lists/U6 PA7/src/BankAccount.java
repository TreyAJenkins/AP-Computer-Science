// AP CS - Lab 6.7 - Big Bucks
/*------------------------------------------
  BankAccount class
  Purpose:  ArrayList practice (Lab6.7)
  Source:  K. Cossa
  updated:  S. Dufour Feb 2016
------------------------------------------*/
public class BankAccount
{
    // instance data
    private String name;
    private double balance;

    // -------------------------------
    // constructor
    // @param name account holder's name
    // @param amt current (initial) balance
    // --------------------------------
    public BankAccount(String name, double amt)
    {
        this.name = name;
        balance = amt;
    }

    // ---------------------------------
    // deposit method
    // @param dep amount to be deposited
    // -----------------------------------
    public void deposit(double dep)
    {
        balance += dep;
    }

    // ----------------------------------
    // withdraw method
    // (no error checking -- account can be negative!)
    // @param withdr amount to be withdrawn
    // ----------------------------------
    public void withdraw(double withdr)
    {
        balance -= withdr;
    }

    // -------------------------
    // accessor method getBalance
    // @return current account balance
    // -------------------------
    public double getBalance()
    {
        return balance;
    }

    // -------------------------
    // accessor method getName
    // @return account holder's name
    // -------------------------
    public String getName()
    {
        return name;
    }

}