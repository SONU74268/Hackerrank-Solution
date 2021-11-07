import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    private static int partition(int[] arr, int lb, int up) {
        int start = lb;
        int end = up;
        int middle = (start+end)/2;
        int pivot = arr[middle];
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        return start;
    }

    private static void quickSort(int[] arr, int start, int end) {

        int location = partition(arr, start, end);

        if (start < location-1)
            quickSort(arr, start, location - 1);

        if (location < end)
            quickSort(arr, location + 1, end);

    }

    public static void main(String[] args) {
        int size, i = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        size = sc.nextInt();

        int[] arr = new int[size];
        while (i < size) {
            arr[i] = sc.nextInt();
            i++;
        }

        quickSort(arr, 0, size - 1);

        System.out.println(Arrays.toString(arr));

        sc.close();
        ;

    }
}
