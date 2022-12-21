package allCodeInOne.BasicJava;

import java.util.ArrayList;
import java.util.Collections;

public class GreatestThreeNumberbyCollection {
    static Integer GreatestNumber(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    public static void main(String[] args) {

ArrayList<Integer> list = new ArrayList<>();
        list.add(189);
        list.add(56);
        list.add(14);
        System.out.println(GreatestNumber(list));
    }
}
