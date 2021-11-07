import java.io.*;
import java.util.Scanner;

public class Day_16 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            int input = Integer.parseInt(sc.nextLine());
            System.out.println(input);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
        sc.close();
    }
}
