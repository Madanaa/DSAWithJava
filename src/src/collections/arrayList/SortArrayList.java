package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(1);
        list.add(33);
        list.add(50);
        list.add(43);
        Collections.sort(list);
        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
