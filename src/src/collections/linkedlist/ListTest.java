package collections.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(24);

        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(23);
        list.addAll(list1);
        System.out.println(list);

    }
}
