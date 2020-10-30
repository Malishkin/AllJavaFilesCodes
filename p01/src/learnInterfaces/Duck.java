package learnInterfaces;

public class Duck implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Swim, Duck, swim!");
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
    }
}
