package com.company;

public class ArrayStars {
    private static void arrayStars(int n1, int n2) {
        for (int i =0; i<n1; i++) {
            for(int j = 0; j<n2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triAngleHalf(int num) {
        for (int i = 1; i<=num; i++){
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triAngle6(){
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triAngle6();

    }
}
