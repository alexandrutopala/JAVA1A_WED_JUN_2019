public class Exemplu1 {
    public static void main(String [] args) throws Exception {
        EvenNumbersThread t1 = new EvenNumbersThread();
        
        OddNumbersRunnable task = new OddNumbersRunnable();
        Thread t2 = new Thread(task);
        
        
        t1.start();
        t2.start();
        
        t1.join();
        // pune firul curent(main) in asteptare pana
        // se executa complet t1
        
        t2.join();
        // pune firul curent(main) in asteptare pana
        // se executa complet t2
        
        System.out.println("end main");
    }
}