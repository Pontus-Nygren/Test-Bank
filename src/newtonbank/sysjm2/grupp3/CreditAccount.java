/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonbank.sysjm2.grupp3;

/**
 *
 * @author Nygreon
 */
public class CreditAccount extends Account {
    private double creditLimit;
    private double debtRate;
    
    public CreditAccount(){
    }
    
    public CreditAccount(double balance, String accountType, int accountID, double interestRate, double creditLimit, double debtRate){
    super(balance, accountType, accountID, interestRate);
    this.creditLimit=creditLimit;
    this.debtRate=debtRate;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getDebtRate() {
        return debtRate;
    }

    public void setDebtRate(double debtRate) {
        this.debtRate = debtRate;
    }
    
    public void hej()
    {
        System.out.println("Hej");
    }
    
}

