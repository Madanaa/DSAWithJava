package collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();
        li.add(0,"madan");
        li.add(1,"gangwar");
        li.add(2,"Rohan");
        li.add(3,"Karan");
        ArrayList <String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Seeta");
        li.addAll(list);
      //  System.out.println(li);
        ListIterator <String> listIterator = li.listIterator(li.size());
        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            System.out.println(str);
        }
        li.forEach(a->{
            System.out.println(a);
        });
        listIterator.forEachRemaining(a->{
            System.out.println(a);
        });
    }
}
