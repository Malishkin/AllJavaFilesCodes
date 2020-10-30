package oop;

public class MainInsect {
    public static void main(String[] args) {
        InsectPolimorphism allinsects[] = new InsectPolimorphism[4];
        allinsects [0] = new RoachInsect();
        allinsects [1] = new BeatleInsect();
        allinsects [2] = new SpiderInsect();
        allinsects [3] = new InsectPolimorphism();
        for (int i=0; i<allinsects.length;i++){
            allinsects[i].eatFood();
        }
    }

}
