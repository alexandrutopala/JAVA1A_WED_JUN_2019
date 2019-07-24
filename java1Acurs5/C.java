public class C {
    int x = 6;
    
    public void m() {
        
        int a = 2;
        class LocalaC {
            
            int x = 1;
            
            public void m() {
                System.out.println(a);
                System.out.println(C.this.x);
            }
            
            class InnerLocalaC {
            }
        }
        
        //a++;
        
    }
}