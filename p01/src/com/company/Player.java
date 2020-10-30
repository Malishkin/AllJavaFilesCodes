package com.company;

public class Player {
    public Player(){
        System.out.println("I'm the best player!");
    }
    public Player(String name){
        System.out.println("I'm "+name);
    }
    public Player(String name,int score){
       System.out.println("I'm "+name+" and I have "+score+" gools");
    }
    String name = "John";
    int score = 0;
    String myName() {
        return name;
    }
    int myscore() {
        return score;
    }
    public String toString() {
        return name+ " "+score;
    }
    public int scoreSum(int tempscore) {
        this.score = score;
        int sum = 0;
        sum = tempscore+score;
        return sum;
    }

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Bill";
        player.toString();
        System.out.println(player);
        System.out.println(player.scoreSum(3));
        Player player1 = new Player("Bob");
        Player player2 = new Player("John", 34);
    }

}
