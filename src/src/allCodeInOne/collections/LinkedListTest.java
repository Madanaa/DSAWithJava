package allCodeInOne.collections;

import java.util.Iterator;
import java.util.LinkedList;
// implement linkedList
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        li.add("Ajay");
        li.add("Arjun");
        li.add("Ram JI");
        li.add("Seeta Ram");
        // list print
        System.out.println(li);
        // return last element by getLast() allCodeInOne.method
        System.out.println(li.getLast());
        // return fast element by getLast() allCodeInOne.method
        System.out.println(li.getFirst());
        // return element by index with get() allCodeInOne.method
        System.out.println(li.get(2));
        // iterate by Iterator
        Iterator<String> it = li.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // Retrieve by for each loop
        for ( String str : li) {
            System.out.println(str);
        }
        // Retrieve by for loop
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }
    }

}
