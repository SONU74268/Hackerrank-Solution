




//  i am trying to solve that problem using ArrayList
//  and some of the test cases pass by this solution ans some got failed 
// due to timeout error.




import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the runningMedian function below.
     */
    static double getMedian(ArrayList<Double> list) {
        Collections.sort(list);
        if (list.size() == 1){
            return list.get(0);
        } else if (list.size() % 2 == 0) {
            
            int x = list.size() / 2;
            int y = x +1;
            double median = (list.get(x-1) + list.get(y-1)) / 2;
            return median;
        } else {
            
            int x = list.size() / 2;
            double median = list.get(x);
            return median;
        }
    }
    static void runningMedian(int[] a) {
        /*
         * Write your code here.
         */
        int len = a.length;
        ArrayList<Double> list = new ArrayList<>();
        double[] result = new double[len];
        for (int i = 0; i < len; i++) {
            double val = a[i];
            list.add(val);
            double ans = getMedian(list);
            result[i] = ans;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int aCount = sc.nextInt();
        int[] a = new int[aCount];

        for (int aItr = 0; aItr < aCount; aItr++) {
            a[aItr] = sc.nextInt();
        }

        runningMedian(a);sc.close();
    }
}
