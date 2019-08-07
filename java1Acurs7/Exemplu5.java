public class Exemplu5 {
    public static void main(String [] args) {
        Integer i1 = 2;
        Long l1 = 2L;
        
        //System.out.println(i1 == l1);
        
        System.out.println(i1.equals(l1));
        
        m(i1);
    }
    
    private static void m(Integer i) {
        System.out.println("1");
    }
    
    private static void m(int i) {
        System.out.println("2");
    }
}