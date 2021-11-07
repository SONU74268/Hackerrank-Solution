import java.util.Scanner;;

public class Day_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec_value = sc.nextInt();
        int remnder, counter, compare_max = 0;
        counter = -1;
        while (dec_value > 0) {
            remnder = dec_value % 2;
            dec_value = dec_value / 2;
            if (remnder == 1) {
                counter++;
            } else
                counter = 0;
            compare_max = Math.max(counter, compare_max);
        }
        System.out.println(compare_max);
        sc.close();
    }
}
