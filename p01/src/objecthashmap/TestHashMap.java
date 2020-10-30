package objecthashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestHashMap {
    public static void main(String[] args) {
       Map<Integer,String>hashMap=new HashMap<>();//нет порядка
       Map<Integer,String>linkedHashMap=new LinkedHashMap<>();//как добавлены, так и будет порядок
       Map<Integer,String>treeMap = new TreeMap<>();//пары ключ-значение сортируются по ключу
        testMap(treeMap);

    }
    public static void testMap(Map<Integer,String>map){
        map.put(44,"Bob");
        map.put(35,"Bill");
        map.put(12,"Jim");
        map.put(57,"Brent");
        map.put(84,"Sandie");
        map.put(0,"Garry");
        for (Map.Entry<Integer,String>entry:map.entrySet())
              {
                  System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
