import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    Node left, right;
    int data, width;
    Node(int data, int width) {
        this.data = data;
        this.width = width;
    }
}
public class Solution {

    public static void swap_nodes(Node root, int K) {
        if (root != null) {
            if (root.width % K == 0) {
                Node tmp = root.left;
                root.left = root.right;
                root.right = tmp;
            }
            swap_nodes(root.left, K);
            swap_nodes(root.right, K);
        }
    }
    public static void inorder_print(Node root) {
        if (root != null) {
        inorder_print(root.left);
        System.out.print(root.data + " ");
        inorder_print(root.right);   
        }
    }

    public static void print_nodes(Node root, int K) {
        swap_nodes(root, K);
        inorder_print(root);
        System.out.println();
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Node root = new Node(1, 1);
        Node cur = root;
        Queue<Node> nodes = new LinkedList<Node>();
        nodes.offer(cur);
        while (N-->0){
            cur = nodes.poll();
            int leftData = sc.nextInt();
            int rightData = sc.nextInt();
            cur.left = (leftData==-1)? null: new Node(leftData, cur.width+1);
            cur.right = (rightData==-1)? null: new Node(rightData, cur.width+1);
            if (cur.left != null && cur.left.data!= -1) 
                nodes.offer(cur.left);
            if (cur.right != null && cur.right.data!=-1) 
                nodes.offer(cur.right);
        }
        int T = sc.nextInt();
        while (T-->0){
            int K = sc.nextInt();
            print_nodes(root, K);
        }
        sc.close();
    }
}