package collections.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();
        list.add("Ram");
        list.add("Seeta");
        list.add("Madan");
        System.out.println(list);
        list.add(2,"rohan");
        System.out.println(list);
        LinkedList<String> list1 = new LinkedList<>();
        list.add("Sona");
        list.add("Riya");
        list.addAll(list1);
        ArrayList<String> list2 = new ArrayList<>();
        list.add("Mohit");
        list.add("Sohit");
        list.addAll(1,list2);
        System.out.println(list);
        list.addFirst("Madan");
        list.addLast("Gangwar");
        System.out.println(list);
    }
}
