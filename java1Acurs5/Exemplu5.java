public class Exemplu5 {
    public static void main(String [] args) {
        Anotimp a = Anotimp.PRIMAVARA;
        
        switch (a) {
            case IARNA : System.out.println("E frig"); break;
            case PRIMAVARA : System.out.println("E mai cald"); break;
            
            case VARA : System.out.println("E cald"); break;
            case TOAMNA : System.out.println("E mai frig"); break;
            default : System.out.println("Nu e anotimp");
        }
        
        Anotimp[] anotimpuri = Anotimp.values();
        
        for (Anotimp anotimp : anotimpuri) {
            System.out.println(anotimp.ordinal() + " " + anotimp.name());
        }
        
        Anotimp a2 = Anotimp.valueOf("VARA");
        System.out.println(a2.getX());
    }
}

