package objecthashmap;

import java.util.HashMap;
import java.util.Map;

public class ObjectHashMap {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<String, String>();//индекс и элемент массива
        data.put("name", "Michael");
        data.put("city", "Omsk");
        data.put("age", "27");
        System.out.println(data.get("name"));
        System.out.println(data.get("city"));
        System.out.println(data.get("age"));
        System.out.println(data.containsKey("age"));
        System.out.println(data.isEmpty());
        System.out.println(data.size());
        data.put("temp", "value");
        for(Map.Entry<String, String> d : data.entrySet()) {
            String key = d.getKey();
            String value = d.getValue();
            System.out.println(key+": "+value);
        }
        data.remove("temp");
        System.out.println("-------------");
        data.forEach((t,u)-> System.out.println(t+": "+u));
        data.values().remove("Omsk");
        System.out.println("-------------");
        data.forEach((t,u)-> System.out.println(t+": "+u));
        data.clear();
        System.out.println("-------------");
        data.forEach((t,u)-> System.out.println(t+": "+u));

    }
}
