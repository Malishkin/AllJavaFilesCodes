package com.company;

public class ReverseNumber {
    public static int reverseInteger(int number) {
        int reversed =0;
        while(number !=0){
            int digit = number%10;
            reversed = reversed*10+digit;
            number=number/10;

        }
        return  reversed;
    }
    public static int sumOfDigits(int number){
        int sum =0;
        while (number>0){
            int digit = number%10;
            sum=sum+digit;
            number/=10;

        }
        return sum;
    }

    public static void main(String[] args) {
      System.out.println(reverseInteger(123456));
      System.out.println(sumOfDigits(423));
    }
}

