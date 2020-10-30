package objectarraylist;

import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<String> login = new ArrayList<>();
        login.add("Malishkin");
        login.add("Aya");
        login.add("Jonathan");
        login.add("LenaShuster");
        login.add("Malachi");
        for(int i = 0; i<login.size();i++){
            System.out.print(login.get(i)+", ");
        }
        System.out.println(login.set(1,"AyaMesseg"));
        login.forEach((i)-> System.out.print(i + ", "));
    }
}
