package allCodeInOne.collections;

import java.util.HashSet;
import java.util.Set;

public class SetImplement {
    public static void main(String[] args) {
        Set<Person> person = new HashSet<>();
        person.add(new Person("Madan",21));
        for (Person p : person) {
            p.sayHello();
        }
        System.out.println(person.add(new Person("Madan",21)));
    }
}
