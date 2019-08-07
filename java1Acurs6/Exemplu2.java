public class Exemplu2 {
    public static void main(String [] args) {
        System.out.println("A");
        
        
        try {
            
            m(2);
        } catch (MyRuntimeException | NullPointerException e) {
            System.out.println("D");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (MyException e) { 
            System.out.println("E");
        } finally {
            System.out.println("C");
        }
        
        System.out.println("B");
    }
    
    private static void m(int i) 
        throws MyException, NullPointerException {
            
        switch (i) {
            case 0 : 
                MyRuntimeException e = 
                    new MyRuntimeException();
                    
                throw e;
                //break;
            case 1 :
                throw new MyException();
                
            case 2 :
                throw new NullPointerException("null pointer");
            
            
                
        }
    }
}