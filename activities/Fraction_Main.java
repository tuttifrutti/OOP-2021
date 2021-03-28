package com.company;

import java.util.Scanner;

public class Fraction_Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(60,300);
        Fraction f3 = f1.Ratio(f2);
        f3.display();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1= input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();

        Fraction f4 = new Fraction(number1,number2);
        System.out.println("Are two Fractions equal? "+ f1.equals(f4,f2));
    }
}
