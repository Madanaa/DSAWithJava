package allCodeInOne.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Madan");
        set.add("C2");
        set.add("Gangwar");
        System.out.println(set.contains("Madan"));
       // SetDemo setDemo = new SetDemo();

//
        for (String str : set) {
            System.out.println(str);

    }
//    public static void show() {
//        String[] list = new String[0];
//        for (String list1 : list){
//            System.out.println(list1);
//        }

    }

}
