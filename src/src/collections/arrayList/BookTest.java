package collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
      Book book = new Book(101,"Madan","gangwar","Java",3);
      Book book1 = new Book(100,"Java","Gangwar","Madan",5);
      books.add(book);
      books.add(book1);
      for (Book b : books) {
          System.out.println(b.id + " "+b.name+ " " +b.author+" " +b.publisher+" " +b.quantity);
      }
    }
}
