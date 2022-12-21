package allCodeInOne.collections.arrayList;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Madan");
        list.add("Gangwar");
        list.add("Reena");
        list.add("Deepa");
//        Iterator it  = list.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
