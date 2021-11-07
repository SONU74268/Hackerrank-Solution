import java.util.Scanner;

public class Day_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = Integer.MIN_VALUE;
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                int result = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
                        + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                sum = Math.max(sum, result);
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
