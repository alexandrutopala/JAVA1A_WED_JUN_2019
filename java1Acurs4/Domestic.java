public class Domestic extends Animal {
    private boolean deInterior;
    
    public Domestic(boolean deInterior) {
        //super("", 0);
        this.deInterior = deInterior;
        System.out.println("c-tor domestic");
    }
    
    public boolean isDeInterior() {
        return this.deInterior;
    }
    
    
    public void setDeInterior(boolean deInterior) {
        this.deInterior = deInterior;
    }
}