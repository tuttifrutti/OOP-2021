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
public class Department {
    private String name;
    private Student[] s;
    int size;
    int count=0;
    
    public Department(){
        name=null; 
    }
    public Department(String name, int size){
        this.name=name;
        s=new Student[size];
        this.size=size;
    }
    public void setName(String n){
        name=n;
        
    }
    public String getName(){
        return name;
    }
    public void addStudent(Student std){
        if(count<size){
        s[count]=new Student();
        s[count]=std;
        count++;
        }
        else{
            System.out.println("Array maximum size reached");
        }}
    public void removeStudent(String name){
        //Student stud=new Student();
        for(int n=0;n<count;n++){
            if(s[n].getName().equalsIgnoreCase(name))
            {
              
               s[n]=s[n+1];
               count--;
            }
        }
        //return stud;
    }
    public void getStudent(){
        for(int i=0;i<count;i++){
            System.out.println(s[i]);
        }
    }
    
}
