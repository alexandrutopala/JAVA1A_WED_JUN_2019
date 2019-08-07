public class DBConnection implements AutoCloseable {
    public DBConnection() {
        System.out.println("Se deschide o conexiune...");
    }
    
    @Override
    public void close() {
        if (true) {
            throw new RuntimeException("exceptie la inchidere");
        }
        System.out.println("Se inchide conexiunea...");
        
    }
}