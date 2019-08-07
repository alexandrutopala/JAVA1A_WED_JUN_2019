public class Exemplu4 {
    public static void main(String [] args) {
        Integer i1 = 2; //boxing //new Integer(2);
        
        i1++;
        
        int x = i1; //unboxing  //i1.intValue();
        
        Object o1 = 3;
        
        System.out.println(x + i1);
        
        int y = Integer.parseInt("3");
        System.out.println(y);
        
        
        
        
        
        
    }
}