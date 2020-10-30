package learnInterfaces;

public class CheeseCake extends Cake {
    @Override
    public void cookingCake() {
        System.out.println("Mixing cheese, eggs, sugar, flour and cooking it");
    }

    public static void main(String[] args) {
        CheeseCake cheeseCake = new CheeseCake();
        cheeseCake.cookingCake();
    }
}
