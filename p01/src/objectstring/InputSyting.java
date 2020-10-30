package objectstring;
import java.util.Scanner;

public class InputSyting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = input.nextLine();
        try {
            System.out.print(s.toLowerCase()+" "+s.toUpperCase()+" "+s.substring(2,6)+" "+s.indexOf("hello"));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
