import java.util.Scanner;

/**
 * Test6
 */
public class Test6 {
    public static void main(String[] args) {

        int counter_0to_9 = 0;
        int counter_10to_19 = 0;
        int counter_20to_29 = 0;
        int counter_30to_100 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of total student : ");
        int student_number = sc.nextInt();
        while (student_number-- > 0) {
            int number = sc.nextInt();
            if (number >= 0 && number <= 9) {
                counter_0to_9++;
            } else if (number >= 10 && number <= 19) {
                counter_10to_19++;
            } else if (number >= 20 && number <= 29) {
                counter_20to_29++;
            } else if (number >= 30 && number <= 100) {
                counter_30to_100++;
            }
        }
        System.out.println("Total value from 0 to 9 : " + counter_0to_9);
        System.out.println("Total value from 10 to 19 : " + counter_10to_19);
        System.out.println("Total value from 20 to 29 : " + counter_20to_29);
        System.out.println("Total value from 30 to 100 : " + counter_30to_100);
        sc.close();
    }
}