package com.company;

public class ArrayMoving {
    public static void arrayMoveOnNumber (int []array, int number) {
        System.out.println("The array before rotatison is:");
        for (int i = 0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
        for(int i =0; i<number; i++ ) {
            int j, last;
            last = array[array.length-1];
            System.out.println("The last number of array is "+last);
            for (j=array.length-1; j >0; j--){
                array[j]=array[j-1];
            }
            array[0]=last;
        }
        System.out.println("The array after rotation is ");
        for (int i =0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        arrayMoveOnNumber(new int[]{1,2,3,4,5}, 3);

    }

}
