public class Exemplu3 {
    public static void main(String [] args) {
        int[][] m1 = new int[3][2];
        
        m1[2][1] = 4;
        
        
        m1[0] = new int[]{1, 4, 5};
        
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m1[i][j] + " ");
            }
            
            System.out.println();
        }
        
        for (int v[] : m1) {
            for (int x : v) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        
        int[] v1, v11;
        int v2[], v22;
        int[] v3[], v4[][];
        // v3 - 2 dim
        // v4 - 3 dim
        
        
    }
}