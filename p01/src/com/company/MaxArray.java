package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class MaxArray {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the number " + (i + 1) + ": ");
            array[i] = input.nextInt();

            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                }
            }
        }
        System.out.println("The maximal number is: " + max);


    }
}