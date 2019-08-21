import java.util.*;

public class Exemplu2 {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(2);
        
        list.add(1);
        list.add(2);
        list.add(3);
        
        System.out.println( list.size() );
        System.out.println( list.isEmpty() );
        System.out.println( list.contains(2) );
        System.out.println( list.get(0) ); // elementul de la indexul 0 din list
        
        for (Integer x : list) {
            System.out.println(x);
        }
        
        System.out.println(list);
        
        list.forEach(x -> System.out.println(x));
        
        
        
    }
}