package collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(13);
        list.add("Hello");
        list.add(78.7);
        list.add(true);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
