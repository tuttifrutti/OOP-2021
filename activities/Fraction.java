package com.company;

public class Fraction {
    private int number_1;
    private int number_2;
    public Fraction(){
        number_1 = 3;
        number_2 = 9;
    }
    public Fraction(int x, int y){
        number_1 = x;
        number_2 = y;
    }
    public void setNumber_1(int x) {
        this.number_1 = x;
    }
    public void setNumber_2(int y) {
        this.number_2 = y;
    }
    public int getNumber_1() {
        return number_1;
    }
    public int getNumber_2() {
        return number_2;
    }
    public int greatest_common_divisor(int a, int b){
        int greatest_common_divisor = 1;
        for (int i = 1; i <= number_1 && i <= number_2; ++i) {
            if (number_1 % i  == 0 && number_2 % i == 0) {
                greatest_common_divisor = i;
            }
        }
        return greatest_common_divisor;
    }
    public Fraction Ratio(Fraction f){
        Fraction f_new = new Fraction(f.number_1 / f.greatest_common_divisor(f.getNumber_1(), f.getNumber_2()),
                f.number_2 / f.greatest_common_divisor(f.getNumber_1(), f.getNumber_2()));
        return f_new;
    }
    public void display(){
        System.out.println(number_1 + ":" + number_2);
    }
    public boolean equals(Fraction fraction_1, Fraction fraction_2) {
        if (Ratio(fraction_1) != Ratio(fraction_2)) {
            return false;
        }
        else {
            return true;
        }
    }
}
