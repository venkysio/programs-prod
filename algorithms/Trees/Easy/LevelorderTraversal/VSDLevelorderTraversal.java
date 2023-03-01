import java.util.LinkedList;

import java.util.Queue;

class Node {
    int data;
    Node left=null, right=null;

    Node(int data) {
        this.data = data;
    }
}

public class Main {   

    static void levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            Node node=q.poll();
            if(node.left!=null)
                q.add(node.left);
            if(node.right!=null)
                q.add(node.right);
            System.out.print(node.data+" ");
        }
        
    }

   

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        levelOrder(root);
    }
}