package collectionAll.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessingAllElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // check if arrayList is Empty
        System.out.println("Is this list empty "+ list.isEmpty());
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        // find the size of arrayList
        System.out.println("Size of Array List is "+list.size());
        // retrieve the element by index
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        String lastElement = list.get(list.size()-1);
        System.out.println(lastElement);
        list.set(2,"Madan");
        System.out.println(list);
    }
}
