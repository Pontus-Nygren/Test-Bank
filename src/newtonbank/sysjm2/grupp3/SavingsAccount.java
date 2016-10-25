/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonbank.sysjm2.grupp3;

import java.util.Calendar;

/**
 *
 * @author Befkadu Degefa
 */
public class SavingsAccount extends Account
{

    
    Calendar currentYear = Calendar.getInstance();
    private int counter = 0;
    /**
     * Default constructor
     */
    public SavingsAccount(){ 
    super();
    }

    public SavingsAccount(double balance, String accountType, int accountID, double interestRate)
    {
        super(balance, accountType, accountID, interestRate);
        
    }

    
   
    
    
    @Override
    public void withdraw(double withdrawAmount)
    {
        
        int numberOfWeeksInYear = currentYear.getWeeksInWeekYear();
        int currentWeekOfYear = currentYear.get(Calendar.WEEK_OF_YEAR);
        if(currentWeekOfYear <= numberOfWeeksInYear)
        {
            if(counter == 0)
            {
            super.withdraw(withdrawAmount);
            counter++;
            }
            
            else
            {
               super.withdraw(withdrawAmount + (getInterestRate()*withdrawAmount/100));
            }
        }

    }
        @Override
    public String toString()
    {
        return ", interestRate=" + getInterestRate() +  ", Balance " + getBalance();
    }
//    public void CalculateInterest()
//    {
//        System.out.println("Balance " + getBalance()); //test
//        double calculatedInterest = getBalance() * interestRate/100;   
//        System.out.println("Calculated Interest " + calculatedInterest); //test
//    }
}
