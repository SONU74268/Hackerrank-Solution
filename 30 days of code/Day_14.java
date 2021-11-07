import java.util.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference = Integer.MIN_VALUE;

	// Add your code here
    Difference(int[] array) {
        elements = array;
    }
    public void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = i+1; j < elements.length; j++) {
                int diff = Math.abs(elements[i] - elements[j]);
                maximumDifference = Math.max(maximumDifference, diff);
            }
        }
    }

} // End of Difference class

public class Day_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}