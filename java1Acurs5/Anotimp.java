public enum Anotimp {
    IARNA(4),
    PRIMAVARA(-1),
    VARA(2),
    TOAMNA(9);
    
    private int x;
    
    Anotimp(int x) {
        this.x = x;
    }
    
    public int getX() {
        return x;
    }
}