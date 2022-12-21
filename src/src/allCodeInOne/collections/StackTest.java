package allCodeInOne.collections;
import  java.util.Iterator;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Madan");
        stack.push("Karan");
        stack.push("Arun");
        stack.push("Mohit");
        stack.push("Ram");
        // Iterate by Iterator
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //stack.pop();
        System.out.println(stack);
        // Iterate by Iterator
        for (String str : stack) {
            System.out.println(str);
        }
        for (int i = 0; i < stack.size();i++){
            System.out.println(stack.get(i));
        }
    }
}
