package allCodeInOne.genrictype;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(12));
        list.add(new Vehicle(13));
        list.add(new Vehicle(14));
        // call allCodeInOne.method here
        show(list);
        System.out.println("************");
        list.add(new Car(1,"Md"));
        list.add(new Car(2,"bmw"));
        show(list);
        show1(list);
    }
    // upper bond
    public static void show(List<? extends Vehicle>  list) {
        for (Vehicle object : list) {
            System.out.println(object);
        }
    }
    // lower bond
    public static void show1(List<? super Car> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
