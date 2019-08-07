public class Pisica {
    String nume;
    int varsta;
    
    Pisica(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Pisica)) {
            return false;
        }
        
        if (other == null) {
            return false;
        }
        
        Pisica p = (Pisica) other;
        
        return this.varsta == p.varsta;
    }
    
    @Override
    public int hashCode() {
        return varsta * 4 % 23;
    }
    
    @Override
    public String toString() {
        return nume + " " + varsta;
    }
    
    
    
    
}


