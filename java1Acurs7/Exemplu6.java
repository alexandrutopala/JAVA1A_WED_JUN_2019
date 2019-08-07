import java.util.*;

public class Exemplu6 {
    public static void main(String [] args) {
        Random random = new Random();
        
        System.out.println( random.nextInt() );
        
        System.out.println( random.nextInt(4) ); // [0, 4)
        
        System.out.println( random.nextInt(22) - 10 );
    }
}