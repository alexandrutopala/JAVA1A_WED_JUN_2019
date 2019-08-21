import java.util.*;

public class Exemplu6 {
    public static void main(String [] args) {
        Set<String> set = new LinkedHashSet<>();
        
        set.add("Bucuresti");
        
        set.add("Iasi");
        set.add("Sibiu");
        set.add("Iasi");
        set.add("Brasov");
        
        System.out.println(set);
        
        
        List<Integer> list = new ArrayList<>();
        
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(2);
        
        Set<Integer> set1 = new LinkedHashSet<>(list);
        System.out.println(set1);
        
    }
}