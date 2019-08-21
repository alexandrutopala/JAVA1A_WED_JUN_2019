public class Exemplu1 {
    public static void main(String [] args) {
        Cutie c1 = new Cutie();
        
        Cutie<Integer> c2 = new Cutie<Integer>();
        // c2 accepta doar instante de Cutie care au ca 
        // tip generic strict Integer
        
        //new Cutie<int>();
        
        Cutie<?> c3 = new Cutie<int[]>();
        // c3 accepta o instanta de Cutie, indiferent de tipul
        // ei generic
        
        new Cutie< Cutie<Integer> >();
        
        Cutie<? extends Number> c4 = new Cutie<Integer>();
        // c4 accepta o instanta de Cutie ce are ca tip 
        // generic o clasa ce mosteneste pe Number (si inclusiv pe Number)
        
        Cutie<? super Number> c5 = new Cutie<Number>();
        // c5 accepta o instanta de Cutie ce are ca tip 
        // generic o clasa superioara lui Number (si inclusiv pe Number)
        
        Cutie<Integer> c6 = new Cutie<>();
        
    }
}