package allCodeInOne.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericCollection {
    public static void main(String[] args) {
        ArrayList<String> aList  = new ArrayList<>();
        aList.add("Madan");
        aList.add("Lalbachan");
        aList.add("Karan");
        System.out.println(aList);
        // Iterate by iterator
        Iterator<String> iterator = aList.listIterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
      // Iterate by for each
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(14);
        list.add(15);

        for (Integer l : list) {
            System.out.println(l);
        }
        // Iterate by for loop
        for (int i = 0; i < aList.size();i++) {
            System.out.println(aList.get(i));
        }
    }
}
