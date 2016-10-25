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
public class Customer
{

    private String customerName;
    private long personalNumber;
    private Account account;

    /**
     * Default constructor
     */
    public Customer() {  }
    
    public Customer(long personalNumber)
    {
        this.personalNumber = personalNumber;
    }
    public Customer(String customerName, long personalNumber)
    {
        this.customerName = customerName;
        this.personalNumber = personalNumber;
    }

    public Customer(String customerName, long personalNumber, Account account)
    {
        this.customerName = customerName;
        this.personalNumber = personalNumber;
        this.account = account;
    }

    @Override
    public String toString()
    {
        return "customerName=" + customerName + ", personalNumber=" + personalNumber + "\n";
    }
    
    public String toString1()
    {
        return "customerName=" + customerName + ", personalNumber=" + personalNumber + ", Account type= " + account.getAccountType() + "\n";
    }
    
    public String toString2()
    {
        return "customerName=" + customerName + ", personalNumber=" + personalNumber + account;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public long getPersonalNumber()
    {
        return personalNumber;
    }

    public void setPersonalNumber(long personalNumber)
    {
        this.personalNumber = personalNumber;
    }

    public Account getAccount()
    {
        return account;
    }
       
}
