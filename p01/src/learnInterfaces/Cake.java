package learnInterfaces;

public class Cake implements CookingCake, Messenger{
    @Override
    public void cookingCake() {
        System.out.println("Mixing eggs, flour and sugar, cooking it with apples");
    }

    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.cookingCake();
    }

    @Override
    public void getMessage() {

    }

    @Override
    public void sendMessage() {

    }
}
