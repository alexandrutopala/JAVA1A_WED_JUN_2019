public class Cerc {
    Punct centru;
    int raza;
    
    Cerc(Punct centru, int raza) {
        this.centru = centru;
        this.raza = raza;
    }
    
    double getArie() {
        return Math.PI * this.raza * this.raza;
    }
    
    boolean isInside(Punct p) {
        return centru.getDistance(p) <= raza;
    }
    
    
    
}

