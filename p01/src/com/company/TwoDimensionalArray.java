package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    private static void replaceNumber(int[][]array) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the row:");
        int myrow = input.nextInt();
        System.out.println("Please, enter the colomn:");
        int mycolomn = input.nextInt();
        int oldnumber = array[myrow][mycolomn];
        System.out.println("The number is "+oldnumber);
        System.out.println("Please, enter the new number:");
        int newnumber = input.nextInt();
        System.out.println("The number is "+newnumber);
         array[myrow][mycolomn]=newnumber;



        for (myrow = 0; myrow<array.length;myrow++) {
            for(mycolomn=0; mycolomn < array[myrow].length;mycolomn++ ) {

                    System.out.print(array[myrow][mycolomn]+" ");


            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        int [][]myarray = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16},
                         {17,18,19,20},
                         {21,22,23,24}};
        //System.out.println(array[1][0]);
//        `for (int i = 0; i<array.length;i++) {
//            for (int j = 0; j<array[i].length;j++) {
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }
        replaceNumber(myarray);

//      `

    }
}
