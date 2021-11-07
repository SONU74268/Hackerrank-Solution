import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x-- > 0) {

            try {
                long input = sc.nextLong();
                System.out.println(input + "can be fitted in :");
                if (Byte.MAX_VALUE >= input && Byte.MIN_VALUE <= input) {
                    System.out.println("* : byte");

                }
                if (Short.MAX_VALUE >= input && Short.MIN_VALUE <= input) {
                    System.out.println("* : Short");
                }
                if (Integer.MAX_VALUE >= input && Integer.MIN_VALUE <= input) {
                    System.out.println("* : int");
                }

                if (Long.MAX_VALUE >= input && Long.MIN_VALUE <= input) {
                    System.out.println("* : Long");
                }

            } catch (Exception e) {

                System.out.println("can't be fitted anywhere");
                continue;
            }
        }
        sc.close();
    }
}
