import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left = null, right = null;

    Node(int data) {
        this.data = data;
    }
}

public class Main {
    static int s=0;

    static void leafSum(Node root){
        if(root==null) return;
        if(root.left==null && root.right==null)s+=root.data;
        leafSum(root.left);
        leafSum(root.right);
    }
   
    

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        leafSum(root);
        System.out.println(s);
    }
}