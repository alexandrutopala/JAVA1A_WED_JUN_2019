public class Caine {
    
    private final static class SingletonHolder {
        public final static Caine SINGLETON = new Caine();
    }
    
    private Caine() {
    }
    
    public static Caine getInstance() {
        return SingletonHolder.SINGLETON;
    }
}