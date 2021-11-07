/**
 * Test3
 */
/**
 * Delta
 */
interface Delta {
    // final int b = 20;
    // final int a = 10;
    public int sum(int a, int b);

    int sub(int a, int b);
}

/**
 * Ema
 */
interface Ema {
    void sum(int a, int b);

}

public class Test3 {
    public static void main(String[] args) {
        // ANONYMUS CLASS USED TO CREATE A OBJECT WHICH IS USED ONLY SINGLE TIME IN THE
        // CLASS
        Delta obj = new Delta() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }

            @Override
            public int sub(int a, int b) {
                return b - a;
            }

        };
        int result_sum = obj.sum(4, 4);
        int result_sub = obj.sub(93, 4);
        System.out.println(result_sub);
        System.out.println(result_sum);

        // LAMBDA EXPRESSION ONLY USED WITH INTERFACES
        // LAMBDA EXPRESSION USED FOR SINGLE SINGLE INTERFACE METHOD
        Ema obj1 = (a, b) -> {
            System.out.println(a + b);
        };
        obj1.sum(2, 4);

    }
}