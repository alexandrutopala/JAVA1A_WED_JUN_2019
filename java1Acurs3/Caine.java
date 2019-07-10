public class Caine {
    static int countInstante;
    String nume;
    int varsta;
    
    static {
        
        System.out.println("bloc anonim static");
    }
    
    {
        
        System.out.println("bloc anonim non-static");
    }
    
    Caine(String nume, int varsta) {
        this.nume = nume;
        
        this.varsta = varsta;
        countInstante++;
        System.out.println("c-tor caine");
        
    }
    
    void sayHello() { // context non-static
        System.out.println("Ham! Eu sunt " + nume);
        System.out.println(countInstante);
    }
    
    static void m() { // context static
        System.out.println("O metoda statica");
        System.out.println(countInstante);
        //this.nume = "max";
        // nu putem accesa membri non-statici dintr-un 
        // context static
    }
}





