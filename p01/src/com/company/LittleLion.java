package com.company;

public class LittleLion {


    public static void main(String[] args) {
        Lion myLion = new Lion(140, 80, "white", 48);
        myLion.height = 140;
        myLion.color = "white";


        int w = myLion.wight;
        System.out.println("My height is "+myLion.height);
        myLion.roar();
        String r = myLion.hunt();
        System.out.println(r);
        myLion.lionColor();
        myLion.newHeight(200);
        Lion lion = new Lion(98, 77, "black", 60);
        lion.wight = 250;
        System.out.println("The wight is  "+lion.wight);


    }
}
