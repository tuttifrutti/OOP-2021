package com.decisionmaking;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randNum = rand.nextInt(3);
        System.out.println("Enter your choice"
                + "\n 0 for Rock"
                + "\n 1 for paper"
                + "\n 2 for secisor");
        int choice = scan.nextInt();
        if (choice == 0){
            if (randNum == 1)
                System.out.println("Computer chose Paper. Computer won");
            else if (randNum == 2)
                System.out.println("Computer chose secisor. You won");
            else
                System.out.println("Draw");
        }
        else if (choice == 1){
            if (randNum == 0)
                System.out.println("Computer chose Rock. You won");
            else if (randNum == 2)
                System.out.println("Computer chose secisor. Computer won");
            else
                System.out.println("Draw");
        }
        else if (choice == 2){
            if (randNum == 0)
                System.out.println("Computer chose Rock. Computer won");
            else if (randNum == 1)
                System.out.println("Computer chose Paper .You won");
            else
                System.out.println("Draw");
        }
        else
            System.out.println("You entered wrong choice");
    }
}