package collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Amit");
        v.add("Ankur");
        v.add("Madan");
        // Retrieve by Iterator
        Iterator<String> it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // Retrieve by For each
        for ( String str : v) {
            System.out.println(str);
        }
        // Retrieve by for loop
        for (int i = 0; i < v.size();i++) {
            System.out.println(v.get(i));
        }

    }
}
