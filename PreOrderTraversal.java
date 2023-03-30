/*Copyrights to venkys.io*/
/*For more programs visit venkys.io */
/*Java program for Pre-order Traversal*/
class Node{//Representing a Node of a Binary Search Tree
    int val;
    Node left;
    Node right;
    //constructor 
    Node(int data){
        this.val=data;
        this.left=null;
        this.right=null;
    }
}
class PreOrder{
    Node root;
    PreOrder(){
        root=null;
    }
    //method to print the Pre-Order Traversal of a tree
    public void preOrder(Node root){
        if(root!=null){
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
public class PreOrderTraversal {
    //main method
    public static void main(String[] args) {
        PreOrder tree=new PreOrder();
        //creating a binary search tree
        tree.root=new Node(50);
        tree.root.left=new Node(27);
        tree.root.right=new Node(63);
        tree.root.left.right=new Node(38);
        tree.root.left.left=new Node(18);
        tree.root.right.left=new Node(54);
        tree.root.right.right=new Node(72);
        System.out.println("PreOrder Traversal of a Binary Search Tree");
        tree.preOrder(tree.root); 
        System.out.println();
    }
}
