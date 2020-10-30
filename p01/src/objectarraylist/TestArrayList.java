package objectarraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
//        List<Integer> linkedList = new LinkedList<>();
//        List<Integer> arrayList = new ArrayList<>();
//        mesureTime(linkedList);
//        mesureTime(arrayList);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(10);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
    }
    private static void mesureTime(List<Integer>list){

        long start = System.currentTimeMillis();
        for (int i = 0; i<100000;i++){
            list.add(0, i);//добавление наоборот
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
