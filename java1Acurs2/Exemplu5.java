public class Exemplu5 {
    public static void main(String [] args) {
        Pisica p1;
        p1 = new Pisica();
        
        p1.culoare = "rosu";
        p1.nume = "tom";
        
        p1.varsta = 5;
        
        System.out.println(p1.nume);
        
        Pisica p2 = p1;
        p2.nume = "mitzi";
        
        System.out.println(p1.nume);
        
        Pisica p3 = new Pisica();
        p3.nume = "tommy";
        
        System.out.println(p3.nume);
        System.out.println(p1.nume);
        
        p1 = null;
        
        //System.out.println(p1.varsta);
        p2.sayMiau();
        
        
        
    }
}