import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String[] input;
        
        Game game = Game.getInstance();
        System.out.println(game.getNumber());
        
        while (true) {
            try {
                line = scanner.nextLine();
                input = line.split("\\s+");
                
                switch (input[0].toUpperCase()) {
                    case "EQ" : 
                    
                        int guess1 = Integer.parseInt(input[1]);
                        System.out.println( game.isEqual(guess1) );
                        break;
                    case "LT" :
                        int guess2 = Integer.parseInt(input[1]);
                        System.out.println( game.isLess(guess2) );
                        break;
                    case "GT" : 
                        int guess3 = Integer.parseInt(input[1]);
                        System.out.println( game.isGreater(guess3) );
                        break;
                    case "SCORE" : 
                        System.out.println( game.getScore() ); 
                        break;
                    case "RESTART" : 
                        game.restart();
                        System.out.println(game.getNumber());
                        System.out.println("Ghiceste la ce numar ma gandesc");
                        break;
                    case "EXIT" : 
                        System.exit(0);
                    default : System.err.println("Comanda invalida");
                }
                
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        
        
    }
}
