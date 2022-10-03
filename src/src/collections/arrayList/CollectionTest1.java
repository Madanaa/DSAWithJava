package collections.arrayList;

import java.util.ArrayList;

public class CollectionTest1 {
    void show(ArrayList<String> name) {
        for ( String names : name) {
            System.out.println(names);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("White");
        list.add("Red");
        list.add("Green");
     CollectionTest1 test1 = new CollectionTest1();
     test1.show(list);
    }

}
