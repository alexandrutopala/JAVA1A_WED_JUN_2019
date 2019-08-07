public class Exemplu2 {
    public static void main(String [] args) {
        String s = "ana are mere";
        
        // EREM99ERA99ANA
        
        StringBuilder sb = new StringBuilder(s);
        
        sb.reverse();
        
        s = sb.toString();
        
        s = s.replace(" ", "99");
        s = s.toUpperCase();
        
        System.out.println(s);
    }
}