/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonbank.sysjm2.grupp3;

/**
 *
 * @author Befkadu Degefa
 */
public class Account
{
    // POntus testar
    // Magnus testar
    private double balance;
    private String accountType;
    private int accountID;
    private double interestRate;
    /**
     * Default constructor
     */
    public Account()  { }

    public Account(double balance, String accountType, int accountID, double interestRate)
    {
        this.balance = balance;
        this.accountType = accountType;
        this.accountID = accountID;
        this.interestRate=interestRate;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    
    public String getAccountType()
    {
        return accountType;
    }

    public int getAccountID()
    {
        return accountID;
    }
    
    public void deposit(double depositAmount)
    {
        balance = balance + depositAmount;
    }  
    
    public void withdraw(double withdrawAmount)
    {
        balance = balance -withdrawAmount;
    }
    public double getInterestRate()
    {
        return interestRate;
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }


}
    
    

