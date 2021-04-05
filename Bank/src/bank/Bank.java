/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.util.Scanner;
/**
 *
 * @author dd
 */
public class Bank {
 
    private Account[] account;
    private int capacity;
    private int count;
   

    
    public Bank() {
        
    }
    
    public Bank(int capacity){
        this.capacity = capacity;
        count = 0;
        account = new Account[capacity];
    }
    
public void addAccount(int accountNumber,String Name, int cnic, String gender,String address,double balanceAmount){
          if(count<capacity){
            Account act = new Account(accountNumber,Name,cnic,gender,address,balanceAmount);
            account[count]=new Account();
            account[count]=act;
            count++;
            //return true;
        }
          else{
        System.out.println("Maximum capacity reached!!array is full");
                      
          }
        //return false;
    }
    
    public Account searchByNum(int num){
        for(int i = 0;i<count;i++){
            if(account[i].getAccountNumber()==num)
                return account[i];
        
        }
        return null;
        
    }
    
     public void printAccount()
        { 
            
            for(int i=0;i<count;i++){
System.out.println("\n Account Number: "+ account[i].getAccountNumber() +
"\n  Account Title:  "+           account[i].getName()
+"\n CNIC: " +      account[i].getCnic()
+"\n Gender "    +   account[i].getGender() 
+"\n Adress  "      + account[i].getAddress() 
+"\n Account Balance:  "      + account[i].getBalanceAmount());
            }
        
        }
    /**
     * @param args the command line arguments
     */
   
    }

    

