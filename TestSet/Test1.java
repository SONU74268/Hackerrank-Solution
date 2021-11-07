import java.util.ArrayList;
import java.util.function.Consumer;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        // ArrayList ala = new ArrayList<>();
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(5);
        al.add(4);
        al.add(36);
        al.add(5);
        al.add(4);
        System.out.println(al.indexOf(5));
        System.out.println(al);
        // ala.add(3);
        // ala.add(43);
        // System.out.println(ala);
        // // ala = (ArrayList<Integer>) al.clone();
        // // System.out.println(al);
        // System.out.println(ala);
        System.out.println(al.get(4));
        Consumer<? super Integer> x = null;
        // System.out.println(ala);
        al.forEach(x);
        ;

    }

}
