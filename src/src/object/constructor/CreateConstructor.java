package object.constructor;

public class CreateConstructor {
    int id;
    String name;
    public CreateConstructor(int i, String n) {
        id = i;
        name = n;
    }
    void show() {
        System.out.println(id+" "+name);
    }
}
