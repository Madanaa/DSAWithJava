package allCodeInOne.collections.linkedlist;

import java.util.LinkedList;

public class LinkedList3 {
    int id;
    String name,author,publisher;
    int quantity;
    public LinkedList3(int id, String name,String author,String publisher, int quantity) {
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }

    public static void main(String[] args) {
        LinkedList<LinkedList3> list = new LinkedList<>();
        LinkedList3 b = new LinkedList3(123,"java","madan","jk",50);
        list.add(b);
        for (LinkedList3 b1 : list) {
            System.out.println(b.id+" "+b.name+" "+b.author);
        }
    }
}
