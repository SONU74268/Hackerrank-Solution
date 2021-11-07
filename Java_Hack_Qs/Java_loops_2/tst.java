
class tst {
    public static int method(int x) {
        // return (1,2,3);
        return x * x * x;
    }

    public static void main(String[] args) {
        // int x = method();

        // System.out.write("www.instanceofjava.com \n".getBytes());
        // System.out.format("%s", "www.instanceofjava.com \n");
        // PrintStream myout = new PrintStream(new
        // FileOutputStream(FileDescriptor.out));
        // System.err.print("This is custom error message");

        // System.out.println();
        int result = method(5);
        System.out.println(result);
    }
}