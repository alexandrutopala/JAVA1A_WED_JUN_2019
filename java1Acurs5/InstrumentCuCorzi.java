@FunctionalInterface
public interface InstrumentCuCorzi extends Instrument, ObiectDeLemn {
    
    @Override
    default void canta() {
        System.out.println("tra lala");
    }
    
    
    static void metodaStatica() {
        System.out.println("Aceasta e o metoda statica");
    }
}