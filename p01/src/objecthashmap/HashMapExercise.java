package objecthashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {
    public static void main(String[] args) {
        HashMap<String,Integer> persons = new HashMap<String, Integer>();
        persons.put("Michael", 27);
        persons.put("Alex", 30);
        for (Map.Entry<String,Integer> p : persons.entrySet()
             ) {
            String key = p.getKey();
            Integer value = p.getValue();
            System.out.println(key + " is "+value + " years old");

        }
        persons.replace("Michael", 27, 31);
        System.out.println("-------------");
        persons.forEach((t,u)-> System.out.println(t+" is "+u+" years old"));

    }
}
