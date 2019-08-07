public class Exemplu1 {
    public static void main(String [] args) {
        Pisica p1 = new Pisica("Mitzi", 3);
        Pisica p2 = new Pisica("Tom", 4);
        
        Pisica p3 = new Pisica("Tommy", 3);
        Pisica p4 = p3;
        
        System.out.println( p1.equals(p2) ); // false
        System.out.println( p1.equals(p3) ); // true
        System.out.println( p1.equals(null) ); // false
        
        System.out.println( p4 == p3 ); // true
        System.out.println( p1 == p3 ); // false
        
        System.out.println(p1);
        
        
        
        
    }
}