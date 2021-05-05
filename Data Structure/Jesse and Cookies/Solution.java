import java.util.*;

public class Solution {

    /*
     * Complete the cookies function below.
     */

    static int cookies(int k, int[] A) {
        /*
         * Write your code here.
         */
        PriorityQueue<Integer> queue = extracted();
        int count = 0;
        for (Integer a : A) {
            queue.add(a);
        }
        while (queue.size() > 1) {
            if (queue.peek() >= k) {
                return count;
            } else {
                int cookie1 = queue.poll();
                int cookie2 = queue.poll();
                queue.add((cookie1 + cookie2 * 2));
                count++;
            }
        }

        if (queue.size() > 0 && queue.peek() >= k) {
            return count;
        } else {
            return -1;
        }
    }

    private static PriorityQueue<Integer> extracted() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        return queue;
    }

    static boolean checkSweetness(int k, int value) {
        return (k <= value) ? true : false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = cookies(k, arr);

        System.out.println(result);
        sc.close();
    }
}