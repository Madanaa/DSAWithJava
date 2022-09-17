package collections.arrayList;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Maadn");
        list.add("Karan");
        list.add("Rohan");
        list.add("Mohan");
        System.out.println(list);
        // after remove at 0 index
        list.remove(0);
        System.out.println(list);
       list.remove("Karan");
        System.out.println(list);
        list.removeIf(str->str.contains("mohan"));
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
