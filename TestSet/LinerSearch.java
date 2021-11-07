import java.util.Scanner;

class LinerSearch {
    public static void main(String[] args) {
        int searchdata, found = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to found  : ");
        searchdata = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == searchdata) {
                found = i;
                break;
            }
        }

        if (found == -1) {
            System.out.println("Element not found :))");
        } else
            System.out.println("Element found at : " + found+1 + "Positon.");
        sc.close();
    }
}