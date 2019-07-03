public class Exemplu6 {
    public static void main(String [] args) {
        Bar b = new Bar();
        
        
        
        int rez = b.suma(5, 6);
        
        Pisica p1 = new Pisica();
        p1.nume = "tom";
        int x = 4;
        
        
        x = b.transferValoare(x);
        b.transferReferinta(p1);
        
        System.out.println(x);
        System.out.println(p1.nume);
        
    }
    
    
    
}