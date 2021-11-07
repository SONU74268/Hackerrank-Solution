import java.util.Scanner;

class Mango_tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int m = sc.nextInt();
        System.out.println("Enter Coloum : ");
        int n = sc.nextInt();
        System.out.println("Enter the treee location : ");
        int check_value = sc.nextInt();
        int count = 1;

        int[][] a = new int[m][n];
        if (check_value <= m * n) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = count++;
                    if (a[i][j] == check_value) {
                        if (j == 0 || j == n - 1) {
                            System.out.println("yes");
                            break;
                        } else {
                            System.out.println("No");
                            break;
                        }

                    }

                }
            }

        } else {
            System.out.println("enter a valid locationdd");
        }
        sc.close();
    }
}