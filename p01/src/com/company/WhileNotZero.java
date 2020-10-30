package com.company;
import java.util.Scanner;

public class WhileNotZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");

        do {
            number=input.nextInt();
            System.out.println("You entered number "+number);

        }while (number!=0);
        System.out.println("You finished the programm");

    }
}