package learnInterfaces;

public class Telegram implements Messenger {
    @Override
    public void getMessage() {
        System.out.println("Reading message in Telegram");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending maeesge in Telegram");

    }

    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        telegram.getMessage();
    }
}
