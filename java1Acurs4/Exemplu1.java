public class Exemplu1 {
    public static void main(String [] args) {
        Animal a1 = new Animal("Rex", 7);
        
        //a1.nume = null;
        a1.setNume(null);
        
        
        System.out.println(a1.getNume());
    }
}