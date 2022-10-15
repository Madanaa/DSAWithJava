package collectionAll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateArrayList {
    public static void main(String[] args) {
        // create list of animal
        List<String> list = new ArrayList<>();
        // Adding new element to the arraylist
        list.add("Dog");
        list.add("Deer");
        list.add("Lion");
        list.add("Tiger");
        list.add("Cat");
        // print arraylist
        System.out.println(list);
        // iterate list by for each loop
        for (String str : list) {
            System.out.println(str);
        }
        // iterate by for loop
        System.out.println("**********************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // iterate by iterator
        // add element in particular indexed
        list.add(1,"Bear");
        System.out.println("************************");
        Iterator<String> stringIterator = list.listIterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
