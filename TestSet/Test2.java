import java.util.ArrayDeque;

class Test2 {
    public static void main(String[] args) {
        ArrayDeque<Object> ll = new ArrayDeque<>();
        ll.add(9);
        ll.add(10);
        ll.add(2);
        ll.add(32);
        ll.add(3.43);
        ll.add(958);
        ll.add('a');
        for (Object object : ll) {
            System.out.println(object);
        }
        System.out.println(ll);
        ll.offerFirst("sonu");
        ll.addFirst(83);
        System.out.println(ll);
        ll.removeFirst();
        ll.remove(32);
        System.out.println(ll);
        System.out.println(ll.removeLast());
        System.out.println(ll);

    }
}