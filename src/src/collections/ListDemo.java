package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Double> li = new ArrayList<>();
        li.add(12.6);
        li.add(34.9);
        System.out.println(li);
        System.out.println(li.get(0));
    }
}
