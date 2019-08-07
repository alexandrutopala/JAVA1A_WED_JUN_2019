import java.util.*;

public class Game { 
    private static final int START_TRIES = 20;
    private static Game singleton;
    
    private int number;
    private int tries;
    private Random random = new Random();
    
    private Game() {
        restart();
    }
    
    public static Game getInstance() {
        if (singleton == null) {
            singleton = new Game();
        }
        
        return singleton;
    }
    
    public int getNumber() {
        return number;
    }
    
    public boolean isEqual(int guess) {
        return number == guess;
    }
    
    public boolean isGreater(int guess) {
        return guess < number;
    }
    
    public boolean isLess(int guess) {
        return guess > number;
    }
    
    public int getScore() {
        return tries * 100;
    }
    
    public void restart() {
        tries = START_TRIES;
        number = random.nextInt(100) + 1;
    }
    
    
    
    
    
    
    
}