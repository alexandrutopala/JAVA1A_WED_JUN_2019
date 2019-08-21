import java.util.*;

public class Exemplu7 {
    public static void main(String [] args) {
        Set<Integer> set = new TreeSet<>();
        
        set.add(3);
        
        set.add(-1);
        set.add(10);
        set.add(3);
        
        System.out.println(set);
        
        set.add(2);
        
        System.out.println(set);
        
    }
}