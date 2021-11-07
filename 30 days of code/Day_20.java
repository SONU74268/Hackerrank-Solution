import java.util.Scanner;

public class Day_20 {

    protected static int[] bubbleSort(int[] arr, int size) {
        int swap = 0;
        for (int i = 0; i < size-1; i++) {
            boolean flag = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                    flag = true;
                }
            }
            if (flag == false)
                break;
            // if (swap == 0) {
            //     System.out.println("Array is sorted in " + swap + " swaps.");
            // }
        }
        System.out.println("Array is sorted in " + swap + " swaps.");
        return arr;
    }

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arry : ");
        size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = bubbleSort(arr, size);
        System.out.println("First Element: " + result[0]);
        System.out.println("Last Element: " + result[size-1]);
        sc.close();
    }
}
