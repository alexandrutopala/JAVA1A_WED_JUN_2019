public class Exemplu4 {
    public static void main(String ...args) {
        int s = suma(3, 5, 1, 6);
        int s2 = suma(2, 3, 1);
        int s4 = suma(new int[]{2, 3, 1});
        int s3 = suma();
        
        
    }
    
    static int suma(int... nr) {
        
        int[] v = nr;
        
        int suma = 0;
        
        for (int x : nr) {
            suma += x;
        }
        
        return suma;
    }
}