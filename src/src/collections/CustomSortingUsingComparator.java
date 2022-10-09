package collections;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustomSortingUsingComparator<K,V> {
    private K key;
    private V value;
    public CustomSortingUsingComparator(K key,V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "CustomSortingUsingComparator{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
class App{
    public static void main(String[] args) {
        Comparator<CustomSortingUsingComparator<Integer,String>> COMPARE_KEY = new Comparator<CustomSortingUsingComparator<Integer, String>>() {
            @Override
            public int compare(CustomSortingUsingComparator<Integer, String> o1, CustomSortingUsingComparator<Integer, String> o2) {
                if (o1.getKey() < o2.getKey()) {
                    return -1;
                } else if (o1.getKey() > o2.getKey()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }

        };

     Comparator<CustomSortingUsingComparator<Integer,String>> COMPARATOR_LENGTH_BY_NAME = new Comparator<CustomSortingUsingComparator<Integer, String>>() {
         @Override
         public int compare(CustomSortingUsingComparator<Integer, String> o1, CustomSortingUsingComparator<Integer, String> o2) {
             if (o1.getValue().length() < o2.getValue().length()) {
                 return -1;
             } else if (o1.getValue().length() > o2.getValue().length()) {
                 return 1;
             } else
                 return 0;
         }
     };
        Set<CustomSortingUsingComparator<Integer,String>> set = new TreeSet<>(COMPARATOR_LENGTH_BY_NAME);
      //  set.add(new CustomSortingUsingComparator<>("key","value"));
        set.add(new CustomSortingUsingComparator<Integer,String>(1,"Madan"));
        set.add(new CustomSortingUsingComparator<Integer,String>(5,"Karan"));
        set.add(new CustomSortingUsingComparator<Integer,String>(7,"Neha"));
        set.add(new CustomSortingUsingComparator<Integer,String>(2,"Anand"));
        set.add(new CustomSortingUsingComparator<Integer,String>(3,"Mohan"));
        for (CustomSortingUsingComparator<Integer,String> elements : set) {
            System.out.println(elements);
        }
    }
}
