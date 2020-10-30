package com.company;

public class Lion {
    public Lion(int height, int wight, String color, int maneLenght){
    }
    int height=120;
    int wight = 500;
    String color = "brown";
    double roarDecibels = 5.5;
    int maneLenght = 90;
    int[] array = {200,300,400};
    void roar() {
        System.out.println("RoaRRRRR!");
    }
    String hunt() {
        return "Rabbit!";


    }
    void lionColor() {
        System.out.println(color);
    }
    void newHeight(int newHeight) {
        height = newHeight;
        System.out.println(newHeight);
    }
    public String toString() {
        return height +", "+wight+", "+color+", "+roarDecibels+", "+maneLenght;
    }






    public static void main(String[] args) {
        Lion lion1 = new Lion(120, 90, "yellow", 50);
        lion1.lionColor();
        Lion l1=new Lion(150, 100, "brown", 49);
        l1.toString();
        System.out.println(l1);

    }

}
