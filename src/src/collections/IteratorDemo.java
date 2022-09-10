package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Krishna");
        list.add("Radhe");
        list.add("Ram ji");
        Iterator<String> stringIterator = list.iterator();
        while (stringIterator.hasNext()) {
            String str = stringIterator.next();
            System.out.println(str);
        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}
