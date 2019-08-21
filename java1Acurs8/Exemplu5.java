import java.util.*;

public class Exemplu5 {
    public static void main(String [] args) {
        Set<String> set = new HashSet<>();
        
        set.add("Bucuresti");
        
        set.add("Iasi");
        set.add("Sibiu");
        set.add("Iasi");
        set.add("Brasov");
        
        System.out.println(set);
    }
}