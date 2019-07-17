public class Pisica extends Domestic {
    public String nume; 
    
    public Pisica() {
        super(true);
        super.isDeInterior();
        this.nume = "Tommy";
        System.out.println("c-tor pisica");
    }
    
    public void printThisNume() {
        System.out.println("This: " + nume);
    }
    
    public void printSuperNume() {
        System.out.println("Super: " + super.nume);
    }
    
    @Override
    public void sayHello() {
        System.out.println("Miau! Numele meu este " + nume);
    }
    
    
    
}