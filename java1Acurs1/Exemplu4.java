public class Exemplu4 {
    public static void main(String [] args) {
        int a = 11;
        
        int b = 122;
        
        if (a % 2 == 0) {
            System.out.println("A este par");
        } else if (b % 2 == 0) {
            System.out.println("B este par");
        }
        
        int c = a > b ? a : b;
        System.out.println(c);
        
    }
}