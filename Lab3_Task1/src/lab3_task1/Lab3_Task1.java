/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_task1;
import java.util.Scanner;
/**
 *
 * @author Roshni
 */
public class Lab3_Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int size;
        System.out.println("Enter Size of array");
       size=input.nextInt();
        /*int array[]=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter value in array");
            array[i]=input.nextInt();
        }
        for(int i=0;i<array.length;i++){
         System.out.println("value at index: " + i +" -- " + array[i]);
            
                    
        }*/
        Department d=new Department("FC",size);
        
        Student s1= new Student(123, "amna");
        Student s2= new Student(1244, "anum");
        Student s3= new Student(1254, "Ansa");
        d.addStudent(s1);
        d.addStudent(s2);
        d.addStudent(s3);
        System.out.println("Department Name:  " + d.getName());
        System.out.println("Students in department are:  ");
        d.getStudent();
      d.removeStudent("anum");
      System.out.println("Student removed");
      System.out.println("************************* ");
         d.getStudent();
       
      /*  int cms;String n;
        
       Student s[]=new Student[size];
       for(int i=0;i<s.length;i++){
           s[i]=new Student();
        System.out.println("Enter Sapid");
        cms=input.nextInt();
        input.nextLine();
        System.out.println("Enter name");
        n=input.nextLine();
        
        s[i].setSapId(cms);s[i].setName(n);
       }
       for(int i=0;i<s.length;i++) {
        System.out.println("********************************");
           
          System.out.println(s[i]);
       }
       
        
        
        
        
        /*int num1;
        double num2; 
        float num3;
        String name;
        
        System.out.println("Enter number 1");
        num1=input.nextInt();
        System.out.println("Enter number 2");
        num2=input.nextDouble();
        System.out.println("Enter number 3");
        num3=input.nextFloat();
        input.nextLine();
        System.out.println("Enter name");
        name=input.nextLine();
        System.out.println("Number is: "+num1);
        System.out.println("Number 2: "+ num2);
        System.out.println("Number 3: "+ num3);
        System.out.println("Name: " +name);*/
    }
    
}
