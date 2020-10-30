package com.company;

public class ArraysStructure {
    public static void main(String [] args) {
        int number = 10; //коробка, а в ней число 10 примитивный тип данных
        int[] numbers = new int[5]; // numbers ссылается на [массив] ссылочный тип данных
        for (int i=0; i<numbers.length;i++){
            numbers[i]=i+1;
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("----------");
        int[] numbers1 = {1,2,3,4,5};
        for(int i=0; i<numbers1.length;i++) {
            System.out.println(numbers1[i]);

        }
        System.out.println("-------");
        for(int i:numbers){
            System.out.println(i);
        }



    }

    public static void fill() {
    }
}
