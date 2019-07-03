public class Pisica {
    String nume;
    int varsta;
    String culoare;
    
    
    
    
    Pisica() {
        this("nume default");
        System.out.println("constructor Pisica");
        
    }
    
    Pisica(String nume) {
        //this();
        this.nume = nume;
        System.out.println(nume);
    }
    
    void sayMiau() {
        System.out.println("Miau! Numele meu este " + this.nume);
        
    }
    
}