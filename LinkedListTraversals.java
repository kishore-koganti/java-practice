import java.util.LinkedList;

public class LinkedListTraversals {
    public static void main(String args[]){

        LinkedList<String> li = new LinkedList<String>();
        li.add("ABC");
        li.add(1, "cde");
        li.add(1, "efg");

for (String item : li) {
    System.out.println("LinkedList - Element :" + item);
}
li.set(1, "Test");
System.out.println("After Set - " + li);
    }
    
}
