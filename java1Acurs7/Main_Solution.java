import java.util.*;

public class Main_Solution {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String[] input;
        
        Game_Solution game = Game_Solution.getInstance();
        
        while (true) {
            try {
                // In fiecare iteratie, vom face urmatoarele trei operatii:
                
                // 1. citirea liniei de la tastatura
                line = scanner.nextLine();
                
                // 2. impartierea liniei in subdiviziuni despartite de unul 
                //    sau mai multe spatii
                //    ex.: pentru comanda "EQ 3" vom obtine un array de String cu elementele:
                //          [0] : "EQ"
                //          [1] : "3"
                input = line.split("\\s+");
                
                // 3. interpretarea comenzii, care se afla mereu in input[0] 
                //    (fiecare linie citita de la tastatura incepe cu comanda)
                switch (input[0].toUpperCase()) {
                    case "EQ" : 
                        int guess1 = Integer.parseInt(input[1]);
                        // Daca jucatorul a ghicit numarul, atunci ii spunem
                        // ca a castigat, afisam scorul si restartam jocul automat.
                        // Altfel, ii spunem ca numarul pe care l-a incercat nu e corect
                        if (game.isEqual(guess1)) {
                            System.out.println("You won!");
                            System.out.println("Score: " + game.getScore());
                            game.restart();
                        } else {
                            System.out.println("Wrong");
                        }
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
                        System.out.println("Ghiceste la ce numar ma gandesc");
                        break;
                    case "EXIT" : 
                        System.exit(0);
                    default : System.err.println("Comanda invalida");
                }
                
            } catch (GameOverException e) {
                // Daca o exceptie de tipul GameOverException este aruncata, atunci
                // jucatorul a pierdut. In acest caz, vom afisa mesajul corespunzator,
                // scorul acestuia si vom restarta automat jocul
                System.err.println(e.getMessage());
                System.err.println("Score : " + game.getScore());
                game.restart();
            } catch (Exception e) {
                // Orice alta exceptie care nu e de tipul sau nu mosteneste GameOverException 
                // va fi tratata aici (pentru ca n-am vrea ca pentru orice exceptie jocul sa fie 
                // restartat, spre exemplu)
                
                System.err.println(e);
            }
        }
        
        
    }
}
