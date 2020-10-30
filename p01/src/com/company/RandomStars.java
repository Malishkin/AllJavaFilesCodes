package com.company;
import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class RandomStars {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(6)+1;
        for(int i =0; i<number; i++) {
            System.out.print("*");
        }

        }

    }
