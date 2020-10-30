package objectarraylist;

import java.util.ArrayList;
import java.util.Comparator;

public class ObjectArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<Integer>();
        for (int i = 0; i<10; i++){
            int n = (int)(Math.random()*11);
            arr.add(n);
        }
        System.out.println(arr.get(3));
        for (int i = 0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println(arr.contains(5));
        System.out.println(arr.indexOf(5));
        System.out.println(arr.size());
        System.out.println(arr.remove(3));
        arr.forEach((t)-> System.out.print(t+" "));
        System.out.println(arr.remove(new Integer(5)));
        arr.forEach((t)-> System.out.print(t+" "));
        System.out.println(arr.set(0,5));
        arr.forEach((t)-> System.out.print(t+" "));
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t, Integer t1) {
                return t1-t;
            }
        });
        System.out.println();
        arr.forEach((t)-> System.out.print(t+" "));
        System.out.println();

    }
}
