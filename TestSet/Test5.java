import java.util.Scanner;

class Test5 {
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = { 1, 2, 3, 4, 5 };
        int result = sumArray(x);
        System.out.println(result);
        sc.close();
    }
}
