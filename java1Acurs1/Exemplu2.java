public class Exemplu2 {
    public static void main(String [] args) {
        byte b1;
        
        b1 = 3;
        System.out.println(b1);
        b1 = 5;
        System.out.println(b1);
        
        short s1 = -4, s2 = 10;
        
        int i1 = 0b011011;
        System.out.println(i1);
        int i2 = s1;
        b1 = (byte) s2;
        
        long l1 = 10_000_000_000L;
        
        float f1 = 3.14f;
        
        double d1 = -465.12345678;
        System.out.println(d1);
        
        char c1 = '@';
        char c2 = '\u00B5';
        char c3 = '\n';
        System.out.println(c3);
        System.out.println(c2);
        
        boolean bo1 = true;
        boolean bo2 = false;
        System.out.println(bo1);
        
        String st1;
        st1 = "hello ";
        String st2 = "world";
        String st3 = st1 + st2;
        System.out.println(st3);
        System.out.println(st1 + (4 + 5));
        
        
    }
}