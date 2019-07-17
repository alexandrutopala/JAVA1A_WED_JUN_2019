public class Animal {
    public String nume;
    private int varsta;
    
    Animal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;    
        
        System.out.println("c-tor animal");
    }
    
    Animal() {
        this("Mitzi", 1);
    }
    
    public String getNume() {
        return this.nume;
    }
    
    public void setNume(String nume) {
        if (nume == null) {
            return;
        }
        this.nume = nume;
    }
    
    public int getVarsta() {
        return this.varsta;
    }
    
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    
    public void sayHello() {
        System.out.println("Buna! Numele meu este " + this.nume);
    }
    
    
    
    
    
}