public class EvenNumbersThread extends Thread {
    
    @Override
    public void run() {
        for (int i = 0; i < 25; i += 2) {
            System.out.println(i);
            
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}