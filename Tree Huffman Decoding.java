import java.util.*;
 
abstract class Node implements Comparable<Node> {
    
  	public  int frequency; // the frequency of this tree
    public  char data;
    public  Node left, right; 
    public Node(int freq) { 
    	frequency = freq;
   	}
 
    // compares on the frequency
    public int compareTo(Node tree) {
        return frequency - tree.frequency;
    }
  
}
 
class HuffmanLeaf extends Node {
    
    public HuffmanLeaf(int freq, char val) {
        super(freq);
        data = val;
    }
  
}
 
class HuffmanNode extends Node {
    
    public HuffmanNode(Node l, Node r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }

}


class Decoding {

/*  
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
    
*/ 
    
    void decode(String s, Node root) {
        
        char[] strChar = s.toCharArray();
        Node traverese = root;
        String decode = "";
        for (int i = 0; i < strChar.length; i++) {
            traverese = strChar[i] == '1' ? traverese.right : traverese.left;
            if (traverese.left == null && traverese.right == null) {
                decode += traverese.data;
		    //here we can use print method insted of adding value in decode string
                traverese = root;
            }
        }
        System.out.println(decode);
    }

