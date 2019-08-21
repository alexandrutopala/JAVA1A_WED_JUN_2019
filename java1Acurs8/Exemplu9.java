import java.util.*;

public class Exemplu9 {
    public static void main(String [] args) {
        Map<String, Integer> map = new TreeMap<>();
        
        map.put("Gigel", 1);
        
        map.put("Maria", 2);
        map.put("Costel", 3);
        
        System.out.println(map);
        
        System.out.println( map.containsKey("Maria") );
        System.out.println( map.containsValue(4) );
        
        String key = "Gigel";
        
        System.out.println( map.get(key) );
        map.remove(key);

        System.out.println(map);
        
        map.put("Maria", 4);
        System.out.println(map);
        
        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();
        
        for (String cheie : map.keySet()) {
            Integer valoare = map.get(cheie);
            System.out.println(cheie + " : " + valoare);
        }
        
        
        
    }
}