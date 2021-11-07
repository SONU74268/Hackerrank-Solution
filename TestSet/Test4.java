import java.util.Scanner;

// import java.util.Base64;
// import java.util.Base64.Encoder;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[][] a = new int[x][x];
        int[][] k = new int[x][x];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                k[i][j] = a[j][i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(k[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
