import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String[] input;
        
        Cafenea cafenea = Cafenea.getInstance();
        
        while (true) {
            try {
                line = scanner.nextLine();
                input = line.split("\\s+");
                
                switch (input[0].toUpperCase()) {
                    case "ADD" : adaugaBautura(input); break;
                    case "AFIS" : cafenea.afiseazaBauturi(); break;
                    
                    
                    case "AFIS_CAFELE" : cafenea.afiseazaCafele(); break;
                    case "STERGE" : cafenea.stergeBautura(input[1]); break;
                    case "AFIS_SORTAT" : cafenea.afiseazaSortat(); break;
                    case "EXIT" : System.exit(0); break;
                    default: System.err.println("Comanda invalida");
                }
                
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
    
    private static void adaugaBautura(String [] input) {
        String tip = input[1];
        String nume = input[2];
        int pret = Integer.parseInt(input[3]);
        
        if (tip.equalsIgnoreCase("cafea")) {
            int cofeina = Integer.parseInt(input[4]);
            Cafea cafea = new Cafea(nume, pret, cofeina);
            Cafenea.getInstance().adaugaBautura(cafea);
        } else {
            int zahar = Integer.parseInt(input[4]);
            Suc suc = new Suc(nume, pret, zahar);
            Cafenea.getInstance().adaugaBautura(suc);
        }
    }
    
    
    
}