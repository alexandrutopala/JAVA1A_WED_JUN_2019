public class Persoana implements Comparable<Persoana> {
    String nume;
    int varsta;
    
    Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    
    @Override
    public int compareTo(Persoana other) {
        return this.varsta - other.varsta;
    }
    
    @Override
    public String toString() {
        return nume + " " + varsta;
    }
}