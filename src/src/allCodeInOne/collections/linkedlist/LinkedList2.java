package allCodeInOne.collections.linkedlist;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Madan");
        list.add("Ram ji");
        list.add("Gangwar");
        list.add("Riya");
        list.add("Grimma");
        list.remove("Grimma");
        System.out.println(list);
        System.out.println(list.remove(3));
        LinkedList<String> list1= new LinkedList<>();
        list.add("Mohit");
        list.addAll(list1);
        System.out.println(list);
        list.removeAll(list1);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.removeFirstOccurrence(0);
        list.removeLastOccurrence(3);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }

}
