package genrictype;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data("Hello");
        //String str = (String) data1.getData();
        System.out.println(data1.getData());

        GenericType<String> data = new GenericType<>("Madan");
        String str = data.getData();
        System.out.println(str);
    }
}
