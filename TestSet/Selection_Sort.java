import java.util.Scanner;

public class Selection_Sort {
    public static int[] selectionSort(int[] arr, int size) {

        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = selectionSort(arr, size);
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
