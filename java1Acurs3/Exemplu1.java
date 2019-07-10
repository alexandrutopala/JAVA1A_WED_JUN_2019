public class Exemplu1 {
    public static void main(String [] args) {
        Caine c1 = new Caine("Rex", 4);
        Caine c2 = new Caine("Max", 2);
        
        System.out.println(c1.countInstante);
        
        System.out.println(c2.countInstante);
        
        System.out.println(Caine.countInstante);
        Caine.m();
    }
}