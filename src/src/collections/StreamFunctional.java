package collections;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFunctional {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Karan",23),
                new Person("Arjun",24),
                new Person("Krishna",25)

        );
        Predicate<Person> personPredicate = p -> p.getAge() >=21;
        personList.parallelStream().forEach(p -> System.out.println(p.getName()));

        double aveAdult = personList.stream().filter(personPredicate).mapToInt(Person::getAge).average().getAsDouble();
        System.out.println(aveAdult);

        int sumAge = personList.stream().collect(Collectors.summingInt(Person::getAge));
        System.out.println(sumAge);

        List<String> strings = personList.stream().filter(p -> p.getName().charAt(0) == 'K').map(Person::getName).collect(Collectors.toList());
        System.out.println(strings);

//        for (Person p : personLst) {
//            System.out.println(p);
//        }
    }
}
