package com.company;
import java.util.Scanner;
import java.util.Random;

public class RandomGenerateNumbers {
    public static int GenerateRandom(int min, int max) {
        Random rand = new Random();
        int randomNumber = 0;
        randomNumber = rand.nextInt(max+1-min)+min;
        return randomNumber;

    }

    public static void main(String[] args) {
        System.out.println(GenerateRandom(60,90));
    }

}
