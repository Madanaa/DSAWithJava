package allCodeInOne.collections.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(10);
//             try {
//                 queue.remove();
//             }
//             catch (NoSuchElementException e) {
//                 System.out.println("Queue is empty");
//             }
        // offer will return true
        System.out.println(queue.offer(12));
        System.out.println(queue.offer(7));
        // try {

             queue.offer(10);
             queue.add(1);
             queue.add(2);
             queue.add(3);
             queue.add(4);
             queue.add(5);
        // }
//         catch (IllegalStateException e) {
//             System.out.println("Queue is Full");
//         }
//     System.out.println(queue.offer(8));
        for (Integer element : queue) {
            System.out.println(element);
        }
        System.out.println(queue.element());
    }
}
