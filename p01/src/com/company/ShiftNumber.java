package com.company;

public class ShiftNumber {
    public static int[] shiftArrayRight(int[]array){
        int tmpValue = array[array.length-1];
        for (int i = array.length-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=tmpValue;
        return array;

        
    }
    public static void printArray(int[] array){
        for(int i:array)
            System.out.print(i+" ");
        }
        public static int[] swapElementsInArray(int[]numbers, int dest){
        int tempValue = numbers[0];
        do{
            for(int i =0; i<numbers.length;i++){
                numbers[dest]=tempValue;
                numbers[0]=numbers[dest];


            }
        }while(tempValue!=numbers[0]);

        return numbers;
        }

    public static void main(String[] args) {
        int[]arr=shiftArrayRight(new int[]{1,2,3,4,5});
        int [] arr1 = swapElementsInArray(new int[]{1,2,3,4,5},2);
        printArray(arr1);

    }

    }

