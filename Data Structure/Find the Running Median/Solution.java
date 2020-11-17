/**
 * Solution
 */

import java.util.*;
public class Solution {
    private static PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
    private static PriorityQueue<Integer> minheap = new PriorityQueue<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            addMedian(arr[i]);
            System.out.println(getMedian());
        }
        sc.close();
    }

    static void addMedian(int n ) {
        if (maxheap.isEmpty()) {
            maxheap.add(n);
        } else if (maxheap.size() == minheap.size()) {
            if (n < minheap.peek()) {
                maxheap.add(n);
            } else {
                minheap.add(n);
                maxheap.add(minheap.remove());
            }
        } else if (maxheap.size() > minheap.size()) {
            if (n > maxheap.peek()) {
                minheap.add(n);
            } else {
                maxheap.add(n);
                minheap.add(maxheap.remove());
            }   
        }
 
    }

    static double getMedian() {
        if (maxheap.isEmpty()) {
            return 0;
        } else if (maxheap.size() == minheap.size()) {
            return (maxheap.peek() + minheap.peek()) / 2.0;
        } else {
            return maxheap.peek();
        }
    }
    
}