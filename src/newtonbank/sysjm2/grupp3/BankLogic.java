/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonbank.sysjm2.grupp3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Befkadu Degefa the pro!
 */
public class BankLogic
{
    static List<Customer> allCustomersArrayList;
    private static BankLogic instance; //Step 2 declare the instance variabel
    static List<String> removedCustomerList = new ArrayList<>();
    static List<String> stringListCustomer = new ArrayList<>();

    private BankLogic() //Step 1 change this constructor to private
    {
        allCustomersArrayList = new ArrayList<>();
        Customer customer1 = new Customer("AA1", 11 ,new SavingsAccount(2,"Saving",1003, 123456));
        Customer customer2 = new Customer("BB1", 22 ,new SavingsAccount(2,"Saving",1003, 123456));
        allCustomersArrayList.add(customer1);
        allCustomersArrayList.add(customer2);
    }
    
    public static BankLogic getInstance() //Step 3 write getInstance method
    {
        if(instance==null)
        {
            instance = new BankLogic();
        }
        return instance;
    }
    
    /**
     * Returns all allCustomersArrayList of the bank(Personal number and name)
     * @return 
     */
    public List<Customer> getCustomers()    
    {
 
        return allCustomersArrayList;
    }
    
//    public List<String> getCustomers()//Check the data type, not string, public List<Customer> getCustomers()
//    {
//        
//        for(Customer customerList: allCustomersArrayList)
//        {
//           //List<String> stringListCustomer2 = List.transform(customerList, Functions.toStringFunction());
//           //listCustomerList.get(i) = (List<String>) allCustomersArrayList.get(i);
//        }
//        
//        return stringListCustomer;
//    }
     
    
    /**
     * //Adding the allCustomersArrayList, if not exist in the system. Returns true if the allCustomersArrayList created
     * @param name
     * @param pNr
     * @return 
     */
    public boolean addCustomer(String name, long pNr) 
    {
        boolean check = true;
        for (Customer list : allCustomersArrayList)
        {
            if (list.getPersonalNumber() == pNr)
            {
                check = false;
                break;
            }
        }

        //if the allCustomersArrayList doesn't exist in the database, he/she will be added here
        if (check == true)
        {
            allCustomersArrayList.add(new Customer(name, pNr));//
        }
        return check;
    }
    
    /**
     * To get the information about the specific allCustomersArrayList after entering the personal number, returns name and pNr
     * @param pNr
     * @return 
     */
    public List<String> getCustomer(long pNr)  //Check the data type,  public String getCustomer(long pNr)
    {
        List<String> searchCustomer = new ArrayList<>();//String searchCustomer = null;
        for (int i = 0; i < allCustomersArrayList.size(); i++)
        {
            if (allCustomersArrayList.get(i).getPersonalNumber() == pNr)
            {
                searchCustomer.add(allCustomersArrayList.get(i).toString());
                break;
            }
        }
        return searchCustomer;
    }
    
    /**
     * Change name for the guy having the same personal number
     * return true if the name changes
     * @param name
     * @param pNr
     * @return 
     */
    public boolean changeCustomerName(String name, long pNr)
    {
        boolean changeCustomerName = false;
        for (int i = 0; i < allCustomersArrayList.size(); i++)
        {
            
            if (allCustomersArrayList.get(i).getPersonalNumber() == pNr)
            { 
                allCustomersArrayList.remove(allCustomersArrayList.get(i));
                changeCustomerName = true;
                break;
            }
            
        }
        
        //If there is the same personal number, change the name
        if(changeCustomerName)
        {
        System.out.println(allCustomersArrayList.size());//test
        allCustomersArrayList.add(new Customer(name, pNr));
        }
        
        return changeCustomerName;
    }
    
    /**
     * Deleting the allCustomersArrayList with pNr and the result will be returned
 The return list will have the information about the last balance, interest
     * @param pNr
     * @return 
     */
    public List<String> removeCustomer(long pNr)   
    {
        
        for (int i = 0; i < allCustomersArrayList.size(); i++)
        {
            
            if (allCustomersArrayList.get(i).getPersonalNumber() == pNr)
            { 
                removedCustomerList.add(allCustomersArrayList.get(i).toString2());
                allCustomersArrayList.remove(allCustomersArrayList.get(i));
                break;
            }
            
        }
        
        return removedCustomerList;
    }
    
    /**
     * create an account for a allCustomersArrayList with personal number, that returns the account number
 or return -1 if not created
     * @param pNr
     * @return 
     */ 
    public int addSavingsAccount(long pNr) //data type int
    {
//        Customer c1 = new Customer(pNr);
//        if(getCustomer(pNr)==null)
//        {
//            System.out.println(allCustomersArrayList.size());
//            
//            allCustomersArrayList.add(new Customer(pNr));
            //System.out.println(allCustomersArrayList.get(allCustomersArrayList.size()-1));
            //return c1(pNr).getAccount().getAccountID();
            
//        }
        int anotherAccount=0;
        List<String> searchCustomer = new ArrayList<>();//String searchCustomer = null;

        
        for (int i = 0; i < allCustomersArrayList.size(); i++)
        {
            if (allCustomersArrayList.get(i).getPersonalNumber() == pNr)
            {
             anotherAccount = allCustomersArrayList.get(i).getAccount().getAccountID();
             anotherAccount++;
              break;
            }
        }
        System.out.println("Another account number " + anotherAccount);
        
        return -1;
    }
    
//    public int addSavingsAccount2(long pNr) //data type int
//    {
//        int anotherAccount=0;
//        List<String> searchCustomer = new ArrayList<>();//String searchCustomer = null;
//        if(addSavingsAccount(pNr)==-1)
//        {
//        
//        for (int i = 0; i < allCustomersArrayList.size(); i++)
//        {
//            if (allCustomersArrayList.get(i).getPersonalNumber() == pNr)
//            {
//             anotherAccount = allCustomersArrayList.get(i).getAccount().getAccountID();
//             anotherAccount++;
//              break;
//            }
//        }
//           
//            
//           
//        }
//        return anotherAccount;
//    }
    
}
