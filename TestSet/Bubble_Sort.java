import java.util.Scanner;

public class Bubble_Sort {

    protected static int[] bubbleSort(int[] arr, int size) {
        for (int i = 0; i < size-1; i++) {
            boolean flag = false;
            for (int j = 0; j < size-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false) break;
        }
        
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
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
