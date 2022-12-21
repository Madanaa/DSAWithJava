package allCodeInOne.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add(12);
        list.add(23);
        list.add(44);
        list.add(74);
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add(22);
        list.add(33);
        list.add(88);
        //list.retainAll(list1);
        System.out.println(list);
        Collections.sort(list);
        list.forEach(a->{
            System.out.println(list);
        });
        list.ensureCapacity(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
