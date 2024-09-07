import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
public class NonRepeatingElement{

    public void findElement(int[] input){
        System.out.println("Helooooooo");
        Queue<Integer> s = new ConcurrentLinkedQueue<>();
        for (int i : input) {

           if (s.contains(i))
           {
            System.out.println("iiiii: " +i);
           s.remove(i);
           }else
           {
           s.add(i);
           }
        }
       System.out.println(s);

       for(Integer e : s){
        System.out.println(e);
       }

    }
    

public static void main(String[] args){

    int[] a = new int[]{1,5,6,1,4,4,5};
    NonRepeatingElement n = new NonRepeatingElement();
    n.findElement(a);
    
    
}

}