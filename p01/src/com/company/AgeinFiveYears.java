package com.company;
import java.util.Scanner;

public class AgeinFiveYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, what is your name? ");
        String name = sc.nextLine();
        System.out.println("Hi, "+name+", How old are you?");
        int age = sc.nextInt();
        int old = age+5;
        int young = age-5;

        System.out.println("Did you that in five years you will be "+old+" years old?");
        System.out.println("And five years ago you were "+young+"! Imagine that!");
    }
}
