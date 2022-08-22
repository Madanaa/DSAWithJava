package collections.arrayList;

import java.util.ArrayList;
// what is the different in non-generic and generic ArrayList ?
// solution with example
public class CreateArrayList {
    public static void main(String[] args) {
        // create non-generic arrayList
        ArrayList list = new ArrayList();
        // we can store or add any type data in non-generic arraylist
        // int
        list.add(126);
        // string
        list.add("Madan");
        // float
        list.add(12.56);
        System.out.println(list);
        //create generic arraylist
        ArrayList<Integer>  list1 = new ArrayList<>();
       // we can't store other data
        list1.add(13);
        list1.add(12);
        System.out.println(list1);

    }
}
