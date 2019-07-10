import p1.*;
import p1.p11.*;
import static p1.A.z;
import static java.lang.System.out;

public class Exemplu5 {
    public static void main(String [] args) {
        
        p1.A a = new p1.A();
        a.x = 3;
        
        p1.p11.A a1 = new p1.p11.A();
        a1.y = 5;
        
        B b = new B();
        
        z = 4;
        out.println(z);
        
    }
}