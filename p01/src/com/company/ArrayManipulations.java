package com.company;
import java.util.Scanner;

public class ArrayManipulations {
    public static void moveElementsOfArray(int[] arr, int n) {
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i = 0; i < n; i++){
            int j, last;
            //Stores the last element of array
            last = arr[arr.length-1];
            System.out.println();
            System.out.println("The last element of array is "+last);

            for(j = arr.length-1; j > 0; j--){
                //Shift element of array by one
                arr[j] = arr[j-1];
            }
            //Last element of array will be added to the start of array.
            arr[0] = last;

        }
        System.out.println();
        System.out.println("Array after right rotation: ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }






    public static void main(String[] args) {
        moveElementsOfArray( new int []{1,2,3,4,5}, 3);

    }
}
