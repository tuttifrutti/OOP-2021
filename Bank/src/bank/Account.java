/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
 import java.lang.Exception;
/**
 *
 * @author Roshni
 */
public class Account {
    private int accountNumber;
    private String Name;
    private int cnic;
    private String gender;
    private String address;
    private double balanceAmount;
    
    public Account()
    {
        
    }
    public Account(int accountNumber,String Name, int cnic, String gender,String address,double balanceAmount) {
        this.Name = Name;
        this.cnic = cnic;
        this.gender = gender;
        this.address = address;
        this.accountNumber = accountNumber;
        this.balanceAmount = balanceAmount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getCnic() {
        return cnic;
    }

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
    
    
    public void depositAmount(double amount){
//try{
    if(amount > 0 ){
        balanceAmount= balanceAmount +amount;
        System.out.println("Successfull!!!\nBalance is: " +balanceAmount);
    }

    else{
        //throw new Exception("Invalid value: Amount must be greater than zero");
        System.out.println("Please Enter a valid Ammount ");
    }}
    //catch(Exception e){
    //System.out.println("Exception  " + e.getMessage());
    //}
//}
    public void withdrawAmount(double amount) 
    {
        //double remainingAmount=0;
        //double taxAmount;
       // try{
        if(balanceAmount > amount){
           balanceAmount = balanceAmount-amount;
           System.out.println("Congrats! You have Successfully withdrawn amount");
           System.out.println("Withdraw Amount: "+ amount);
           
           System.out.println("Your Remaining Balanace is: "+ balanceAmount);
         }
        else{
            System.out.println("You entered amount greter than account balance ");
            //throw new Exception("Error-insufficient balnce");
        }
        //}catch(Exception e)
        //{
            //System.out.println( e.getMessage());
           // System.out.println("TRANSACTION FAILURE");  
              //  System.exit(0);
        }
        
        }
        //}
    

