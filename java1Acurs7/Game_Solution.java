import java.util.*;

public class Game_Solution { 
    private static final int START_TRIES = 20;
    private static Game_Solution singleton;
    
    private int number;
    private int tries;
    private Random random = new Random();
    
    private Game_Solution() {
        restart();
    }
    
    public static Game_Solution getInstance() {
        if (singleton == null) {
            singleton = new Game_Solution();
        }
        
        return singleton;
    }
    
    
    public boolean isEqual(int guess) {
        // Daca utilizatorul a castigat, nu vrem sa ii mai decrementam
        // numarul de incercari
        if (number == guess) {
            return true;
        }
        
        decrementTries(2);
        return false;
    }
    
    public boolean isGreater(int guess) {
        decrementTries(1);
        return guess < number;
    }
    
    public boolean isLess(int guess) {
        decrementTries(1);
        return guess > number;
    }
    
    public int getScore() {
        return tries * 100;
    }
    
    public void restart() {
        System.out.println("Ghiceste numarul la care ma gandesc");
        tries = START_TRIES;
        number = random.nextInt(100) + 1;
    }
    
    // Metoda pe care o vom folosi pentru fiecare interogare a utilizatorului
    // (lessThan, greaterThan, equal) pentru a-i decrementa numarul de incercari
    // ramase si, eventual, pentru a incheia jocul in cazul in care a ramas fara incercari
    private void decrementTries(int usedTries) {
        tries -= usedTries;
        
        if (tries <= 0) {
            throw new GameOverException("Incercarile au fost consumate. Mai incearca");
        }
    }
    
    
    
    
    
}