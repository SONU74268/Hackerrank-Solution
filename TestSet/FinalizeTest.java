import java.io.IOException;

/*class Student3 {
    int id;
    String name;

    void display() {
        int j = 1;
        System.out.println(id + " " + name + " " + j);
    }

    public static void main(String args[]) {
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();
        s1.display();
        s2.display();
    }
}*/
public class FinalizeTest {
    int j = 12;

    void add() {
        j = j + 12;
        System.out.println("J=" + j);
    }

    public void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) throws IOException {
        new FinalizeTest().add();
        System.gc();
        new FinalizeTest().add();
        // System.out.println(Runtime.getRuntime().exec("D:\\Java
        // Setup\\eclipse\\eclipse.exe"));

        Runtime.getRuntime().exec("notepad");
    }
}