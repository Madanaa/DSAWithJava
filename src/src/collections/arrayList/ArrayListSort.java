package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Pooja");
        list.add("Akansha");
        list.add("Priya");
        list.add("Anand");
        Collections.sort(list);
//        for (String str : list) {
//            System.out.println(str);
//        }
//        list.forEach(a-> {
//            System.out.println(a);
//        });

        Iterator it = list.iterator();
        it.forEachRemaining(a->{
            System.out.println(a);
        });

    }
}
