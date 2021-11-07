import java.util.Scanner;

/* import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY. The function accepts
     * INTEGER_ARRAY a as parameter.
      

    public static List<Integer> reverseArray(List<Integer> a) {
        int size = a.size();
        for (int i = 0; i < size/2; i++) {
            int x = a.get(i);
            int y = a.get(size-1-i);
            a.set(i, y);
            a.set(size-1-i, x);
        }
        return a;
    }
}

public class Solutionc {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // Scanner sc = new Scanner(System.in);
        list.add(10);
        list.add(11);
        list.add(23);
        list.add(34);
        list.add(66);
        list.add(355);
        list.add(353);

        List<Integer> resultlist = Result.reverseArray(list);
        System.out.println(resultlist);
    }
}
*/

/**
 * Solutionc
 */
public class Solutionc {

    public static int[] reverseArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] resultarray = reverseArray(arr);
        for (int i : resultarray) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}