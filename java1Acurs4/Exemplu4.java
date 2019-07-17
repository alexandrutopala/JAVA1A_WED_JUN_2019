public class Exemplu4 {
    public static void main(String [] args) {
        Pisica p1 = new Pisica();
        Animal a1 = new Pisica();
        
        Animal a2 = new Domestic(true);
        
        
        a1.setNume("Rex");
        //a1.isDeInterior();
        
        a1.sayHello();
        a2.sayHello();
        
        Pisica p2 = (Pisica) a1;
        
        if (a2 instanceof Pisica) {
            Pisica p3 = (Pisica) a2;
            System.out.println("E o pisica");
        } else {
            System.out.println("Nu e o pisica");
        }
        
        System.out.println(a1 instanceof Pisica); // true
        System.out.println(a1 instanceof Animal); // true
        System.out.println(a2 instanceof Animal); // true
        System.out.println(p1 instanceof Domestic); // true
        
        
    }
}