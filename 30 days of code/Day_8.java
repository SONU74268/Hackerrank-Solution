import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Day_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        int N = sc.nextInt();
        // sc.next();
        while (N-- > 0) {
            String key = sc.next();
            String number_value = sc.next();
            // sc.next();
            map.put(key, number_value);
        }
        // sc.hasNext() used to bcz we don't know how many input user want to add and
        // this hasNext method return true if user add more value
        while (sc.hasNext()) {
            String x = sc.next();
            if (map.containsKey(x)) {
                System.out.println(x + "=" + map.get(x));
            } else
                System.out.println("Not found");
        }
        sc.close();

    }
}
