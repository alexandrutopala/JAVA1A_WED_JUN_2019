public class Exemplu3 {
    public static void main(String [] args) {
        int x = 4;
        Integer i = new Integer(x);
        Integer i2 = new Integer(1);
        
        System.out.println(i + i2);
        
        Integer i3 = i % i2;
        System.out.println(i3);
        
        int y = i3.intValue();
        System.out.println(y);
    }
}