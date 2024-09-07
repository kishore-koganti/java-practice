import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class StackTest {
    
    public static int stackOperations(){
        Stack<String> stack = new Stack<String>();
        Queue<String> q = new ConcurrentLinkedQueue<>();
        q.add("Leven");
        q.add("Twelve");
        q.add("Thirteen");
        q.add("Fourteeen");
        

        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");

        stack.pop();
        System.out.println("number of elements:: " + stack.peek());
        System.out.println("number of elements:: " + stack.size());



        return 0;

    }


    public static void main(String[] args) {
        System.out.println("Stack Operations : " + stackOperations());
        
    }
}
