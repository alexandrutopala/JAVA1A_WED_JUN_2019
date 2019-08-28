import java.util.*;

public class Cafenea {
    private static Cafenea singleton;
    
    private Map<String, Bautura> bauturi = new HashMap<>();
    
    private Cafenea() {
    }
    
    public static final Cafenea getInstance() {
        
        if (singleton == null) {
            singleton = new Cafenea();
        }
        return singleton;
    }
    
    public void adaugaBautura(Bautura b) {
        if (bauturi.containsKey(b.nume)) {
            throw new NameAlreadyExistsException();
        }
        
        bauturi.put(b.nume, b);
    }
    
    public void afiseazaBauturi() {
        bauturi.values().forEach(b -> System.out.println(b));
    }
    
    public void afiseazaCafele() {
        bauturi.values().forEach(b -> {
            if (b instanceof Cafea) {
                System.out.println(b);
            }
        });
    }
    
    public void stergeBautura(String nume) {
        bauturi.remove(nume);
    }
    
    public void afiseazaSortat() {
        Comparator<Bautura> comp = (b1, b2) -> b1.pret - b2.pret;
        
        List<Bautura> list = new ArrayList<>(bauturi.values());
        
        Collections.sort(list, comp);
        
        list.forEach(b -> System.out.println(b));
    }
    
    
    
    
    
    
}