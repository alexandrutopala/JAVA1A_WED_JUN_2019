public class Exemplu6 {
    public static void main(String [] args) {
        Punct centru = new Punct(2, 2);
        Cerc c = new Cerc(centru, 3);
        
        System.out.println(c.getArie());
        
        System.out.println(c.isInside(new Punct(1, 1)));
        System.out.println(c.isInside(new Punct(-1, -1)));
    }
}