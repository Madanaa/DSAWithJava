package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTest {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Hariom");
        queue.add("Ram");
        queue.add("Harishankar");
        queue.add("Amit kumar");
        queue.add("Madan");
        System.out.println(queue.element());
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue);
        queue.remove(2);
        System.out.println(queue.remove(3));
        System.out.println(queue.poll());
        // iterate by Iterator
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Iterate by for each loop
        for (String str: queue) {
            System.out.println(str);
        }
        // Iterate by for loop
//        for (int i = 0; i < queue.size();i++) {
//            System.out.println("Iterate "+queue.poll());
//        }
    }
}
