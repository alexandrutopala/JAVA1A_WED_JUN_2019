public class Exemplu1 {
    public static void main(String [] args) {
        Personaj p = createPersonaj();
        p.actioneaza();
    }
     
    
    
    private static Personaj createPersonaj() {
        return new Span();
    }
}