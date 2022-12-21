package allCodeInOne.collections;

import java.util.Objects;

public class Person {
    private  String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void sayHello() {
        System.out.println(name+" Hello");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
