package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArratListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Anita");
        list.add("Arjun");
        list.add("Madan");
        //list.remove(0);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (String str : list) {
            System.out.println(str);
        }
        for (int i = 0; i < list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
