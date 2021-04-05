/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Scanner;

/**
 *
 * @author Roshni
 */
public class TestApplication {
     public static void main(String[] args) {

         Scanner input=new Scanner(System.in);
         String s="IS best";  
         String ss="is best";
   System.out.println(s.substring(6));//Tendulkar  
   System.out.println(s.substring(0,7));//Sachin
   
       System.out.println(s.concat(ss));
       
         if(s.equalsIgnoreCase(ss)){
             System.out.println("yes");
         }
         else{
             System.out.println("No");
         }
         System.out.println(s.charAt(4));
         
         String sr=s.replaceAll(s, "amns");   
         System.out.println(sr);
         String m=s.replaceFirst(s, "d");
         System.out.println(m);
         
          
          String[] sm=new String[3];
          sm[0]="abc";
          sm[1]="def";
          sm[2]="ghi";
          for(int i=0;i<3;i++){
              if(sm[i].endsWith("f"))
              System.out.println(sm[i]);
              else{
                  System.out.println("wrong");
                  }
          }
  Account a=new Account(122,"uzma",1245,"female","ciand",13000);
 System.out.println( a.getName().substring(0,3));
 System.out.println( a.getAddress().charAt(3));
        /* 
        // TODO code application logic here
        //**************initializing Accounts****************
        Account[] account=new Account[3];
        
      for(int i=0;i<3;i++){
            account[i]=new Account();
           int number;
        String name;
        int cnic;
        String gender;
        String adress;
      
        double balance;
        
        System.out.println("please enter Your Name: ");
        name=input.nextLine();
        account[i].setName(name);
        input.nextLine();
         System.out.println("please enter Your cnic: ");
        cnic=input.nextInt();
        account[i].setCnic(cnic); 
        input.nextLine();
        System.out.println("please enter Your Gender: ");
        gender=input.nextLine();
        account[i].setGender(gender); 
         
        input.nextLine();
        System.out.println("please enter Your Address: ");
        adress=input.nextLine();
        account[i].setAddress(adress);
        System.out.println("please enter some balance amount: ");
        balance=input.nextDouble();
        account[i].setBalanceAmount(balance); 
        
        System.out.println("Please enter Account Number");
        
        number=input.nextInt();
        account[i].setAccountNumber(number);
        }
                //***************** setting array in babk class***********
        */
         Bank b1=new Bank(4);
        b1.addAccount(122,"uk",1235,"female","ciyand",13000);
         b1.addAccount(123,"lk",1234,"female","ciyand",14000);
          b1.addAccount(124,"mk",1236,"female","ciyand",13600);
          
          
          //b1.printAccount();
       // ****************************** MENUUUU***************************************
/*System.out.println("1. View Accounts \n 2. Deposit Amount "
        + "\n3. Withdraw Amount ");
System.out.println("Please press 1 for view Accounts \n "
        + "2 for Deposit Money \n "
            + "3 for Withdraw Amount");
    //Scanner input=new Scanner(System.in);
    
    int option;
    option=input.nextInt();
    if(option==1){
        b1.printAccount();
    }
    else if(option==2){
        System.out.println("Enter account number");
        int n=input.nextInt();
        Account s=b1.searchByNum(n);
        if(s!=null){
            System.out.println("Enter amount to deposit");
                double a=input.nextDouble();
                s.depositAmount(a);
        }
        else{
            System.out.println("You entered wrong account number");
        }
            }
    else if(option==3){
       System.out.println("Enter account number");
        int n=input.nextInt();
        Account ac=b1.searchByNum(n);
           if(ac!=null){
                System.out.println("Enter amount to withdraw");
        double amount=input.nextDouble();
                ac.withdrawAmount(amount);
           }
           else{
               System.out.println("You entered wrong account number");
           }   
           
    }*/
     }
}
