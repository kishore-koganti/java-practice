import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraylistFilter {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(2);
        System.out.println("Printing the collection : "
                           + a); 
        List<Integer> ls = a.stream().distinct().collect(Collectors.toList());
        System.out.println( 
            "Printing the List after stream operation : "
            + ls); 

            ls.forEach(System.out::println);
    }
}
