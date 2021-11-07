class hell extends Thread {
    // int a,b;
    // hell(int a, int b) {
    // this.a = a;
    // this.b = b;
    // }
    static int method(int a, int b) throws InterruptedException {
        System.out.println("Thread class");
        Thread.sleep(233);
        return a + b;
    }

    @Override
    public void run() {
        while (true) {
            int x;
            try {
                x = method(3, 4);
                System.out.println(x);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

/**
 * InnerTesimplements Runnablet
 */
class InnerTest implements Runnable {
    static int method1(int a, int b) throws InterruptedException {
        System.out.println("Runnable interface");
        Thread.sleep(233);
        return a + b;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int x = method1(3, 3);
                System.out.println(x);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}

class Test {
    public static void main(String[] args) throws InterruptedException {
        hell jHell = new hell();
        InnerTest it = new InnerTest();
        Thread t2 = new Thread(it);

        jHell.start();
        // t1.sleep(1000);
        t2.start();
        ;
    }
}