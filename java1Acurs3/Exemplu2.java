public class Exemplu2 {
    public static void main(String [] args) {
        int[] v;
        v = new int[4];
        
        v[2] = 4;
        
        v[0] = -1;
        System.out.println(v[3]);
        
        for (int i = 0; i < v.length; i++) {
            System.out.println(i + " " + v[i]);
        }
        
        for (int x : v) {
            System.out.println(x);
        }
        
        int[] v1 = new int[]{2, 5, 1, 6, 0, -1, 0};
        
        for (int x : v1) {
            System.out.println(x);
        }
        
        int[] v2 = {1, 4, 5};
        
        
        
    }
}


