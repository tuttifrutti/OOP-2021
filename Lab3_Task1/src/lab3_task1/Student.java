/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_task1;

/**
 *
 * @author Roshni
 */
public class Student {
    private int sapId;
    private String name;
    
    public Student(){
       sapId=0;
       name=null;
    }
    public Student(int c,String n){
       sapId=c;
       name=n;
    }
    
    public void setSapId(int sapid){
        sapId=sapid;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getSapId(){
        return sapId;
    }
    public String getName(){
        return name;
    }
    
   public String toString(){
       String n= "Sap Id: "+sapId+ " \nName :"+ name;
       return n;
   } 
    
    
}
