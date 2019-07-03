public class Exemplu3 {
    public static void main(String [] args) {
        int a = 6;
        
        int b = 5;
        
        int c = a + b;
        System.out.println(c);
        System.out.println(a % b);
        
        boolean b1 = 6 > -10;
        System.out.println(5 + 6 != 11);
        
        
        boolean b2 = true && false;
        boolean b3 = b2 || true;
        boolean b4 = !b2;
        
        System.out.println(a == 6 && b < 10 || b2 && b3);
        
        a += b;
        System.out.println(a);
        
        a++;
        
        int x = 4;
        int y = x++ + ++x + 5 + --x + 2 * x--;
        
        System.out.println(y);
        System.out.println(x);
        
        
        
    }
}