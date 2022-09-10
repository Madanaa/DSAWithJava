package collections.arrayList;
import java.util.Iterator;
import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(111);
        list.add(121);
        list.add(1111);
        System.out.println(list);
        // Iterate by iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(" Iterator "+it.next());
        }
        // Iterate by For each loop
        for (Integer num : list) {
            System.out.println(" For Each Loop "+ num);
        }
        // Iterate by for loop
        for (int i = 0; i < list.size();i++){
            System.out.println(" FOR LOOP "+ list.get(i));
        }
    }
}
