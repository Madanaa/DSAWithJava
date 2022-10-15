package collectionAll.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromAnotheCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> arrayList = new ArrayList<>(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        arrayList.addAll(list);
        System.out.println(arrayList);

    }
}
