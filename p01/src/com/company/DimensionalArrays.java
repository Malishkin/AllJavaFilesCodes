package com.company;
import java.util.Arrays;

public class DimensionalArrays {
    public static void printArray(int array[][]) {
        for (int row=0; row<array.length;row++) {
            for(int colomn = 0;colomn<array[row].length;colomn++) {
                System.out.print(array[row][colomn]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] myarray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printArray(myarray);

    }
}