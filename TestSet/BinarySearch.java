import java.util.Scanner;

public class BinarySearch {

    public static int binarySerch(int[] arr, int data, int size) {
        int mid, start = 0;
        int end = size - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (data == arr[mid]) {
                return mid;
            } else if (data > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the searching data : ");
        int data = sc.nextInt();

        result = binarySerch(arr, data, size);
        if (result == -1) {
            System.out.println("Element not found");
        } else
            System.out.println("element found at index : " + (result + 1));

        sc.close();
    }
}
