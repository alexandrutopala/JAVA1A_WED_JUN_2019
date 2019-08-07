import java.util.*;

public class Exemplu8 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        String line1 = scanner.nextLine();
        
        String line2 = scanner.nextLine();
        
        int x1 = Integer.parseInt(line1);
        int x2 = Integer.parseInt(line2);
        
        System.out.println(x1 + x2);
    }
}