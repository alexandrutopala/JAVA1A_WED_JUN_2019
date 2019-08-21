public class Cutie<T> {
    T continut;
    
    public T getContinut() {
        return continut;
    }
    
    
    public void setContinut(T continut) {
        this.continut = continut;
    }
    
    static <T> void m(T t) {
        System.out.println("Metoda static cu tip generic");
    }
}