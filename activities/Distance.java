package com.company;

public class Distance {
    private double Inch;
    private double Feet;
    public Distance(){
        Inch = 150;
        Feet = 12.5;
    }
    public Distance(double i, double f){
        Inch = i;
        Feet = f;
    }
    public void setInch(double i){
        Inch = i;
    }
    public void setFeet(double f){
        Feet = f;
    }
    public double getInch() {
        return Inch;
    }
    public double getFeet() {
        return Feet;
    }
    public Distance Add(Distance D_1, Distance D_2){
        Distance d_new = new Distance(Inch+ D_1.Inch + D_2.Inch, Feet+ D_1.Feet + D_2.Feet);
        return d_new;
    }
    public void display(){
        System.out.println("Inche" + Inch);
        System.out.println("Feet" + Feet);
    }
}
