import java.util.*;

public class Exemplu4 {
    public static void main(String [] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addFirst(4);
        list.addFirst(3);
        
        list.addLast(9);
        list.addFirst(10);
        list.removeFirst();
        list.removeLast();
        list.addFirst(3);
        list.removeLast();
        list.removeLast();
        list.addLast(5);
        
        System.out.println(list);
    }
}