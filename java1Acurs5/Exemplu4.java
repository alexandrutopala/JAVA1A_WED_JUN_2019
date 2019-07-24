public class Exemplu4 {
    public static void main(String [] args) {
        
        
        
        
        
        
        Operatie o1 = new Operatie(){
            @Override
            public int calculeaza(int x, int y) {
                return x + y;
            }
            
        };
        
        Operatie o2 = (x, y) -> x + y;
        System.out.println(o2.calculeaza(2, 3));
        
        Operatie o3 = (int x, int y) -> x + y;
        
        Operatie o4 = (x, y) -> {
            int c = x + y;
            return c;
        };
        
        
        
        
        
        
        
    }
}