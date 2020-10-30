package com.company;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

import java.util.Arrays;

public class LottoImproved {
    private static boolean duplicatedInArray(int number,int[] array){
        for(int i=0;i<array.length;i++){
            if (number==array[i]){
                return true;
            }
        }
        return false;
    }
    private static int getValidIntegerFromUser(){
        boolean isValidNumber = true;
        int validNumber = 0;

        do {
            try{Scanner sc = new Scanner(System.in);
                validNumber = sc.nextInt();
                isValidNumber=true;
            }catch (InputMismatchException e){
                System.err.println("Enter numeric value!");
                isValidNumber = false;
            }
        }while (!isValidNumber);
        return validNumber;
    }
    private static int [] getUserArray() {
        Scanner sc = new Scanner(System.in);
        boolean isValid , isDuplicated;
        int tmpValue = 0;
        int[] userArray = new int[6];
        System.out.println("Enter six numbers of the array from 1 to 46, no duplicate numbers: ");
        for (int i = 0; i < userArray.length; i++) {
            do {
                isValid = false;
                isDuplicated = false;
                tmpValue = getValidIntegerFromUser();
                if(tmpValue<1||tmpValue>46) {
                    System.err.println("The number "+tmpValue+" is out of range!");
                    continue;
                }
                for (int j = 0; j <= i; j++) {
                    if (userArray[j] == tmpValue) {
                        System.err.println("The number " + tmpValue + " is duplicated!");
                        isDuplicated = true;
                        break;
                    }
                }
                isValid = !isDuplicated;
            }while (!isValid);
            userArray[i] = tmpValue;
        }
        return userArray;
    }
    private static int [] getLotteryArray(){
        boolean isRepeated;//equal to notDuplicatedInArray
        Random rand = new Random();
        int min = 1, max = 46, slots = 6;
        int [] lotteryArray = new int[slots];
        int randomNumber = 0;
        for(int i = 0; i<slots;i++) {
            do {
                randomNumber=rand.nextInt(max+1-min)+min;
                isRepeated=duplicatedInArray(randomNumber,lotteryArray);

            }while(isRepeated);
            lotteryArray[i]=randomNumber;
        }return lotteryArray;
    }

    private static void getGuessed() {
        int [] userArray = getUserArray();
        System.out.println("The array created is "+Arrays.toString(userArray));
        int[]lotteryArray = getLotteryArray();
        System.out.println("The lottery array is "+Arrays.toString(lotteryArray));
        int counter = 0;
        for (int i =0; i<userArray.length;i++) {
            if (duplicatedInArray(userArray[i],lotteryArray)){
                counter++;
            }
        }
        System.out.println("You guessed "+counter+" numbers");
    }
   public static void main (String[] args ){
        getGuessed();


   }
}
