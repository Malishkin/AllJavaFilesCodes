package com.company;

public class SumDigits {
    public static int sumCalculate(int n) {
        int sum = 0;
        while(n>0) {
            sum = sum + (n%10);
            n = n/10;
        }
        return  sum;
    }

    public static void main(String[] args) {
        int z = sumCalculate(10001);
        System.out.println(z);
    }
}
