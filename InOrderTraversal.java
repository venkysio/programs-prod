/*Copyrights to venkys.io*/
/*For more programs visit venkys.io */
/*Java program for In-order Traversal*/
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
class InOrder{
    //intiating root of the tree
    Node root;
    InOrder(){
        root=null;
    }
    //method to print In-order Traversal of Tree
    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
    }
}
public class InOrderTraversal {
    //main method
    public static void main(String[] args) {
        InOrder tree=new InOrder();
        //creating a binary search tree
        tree.root=new Node(50);
        tree.root.left=new Node(27);
        tree.root.right=new Node(63);
        tree.root.left.right=new Node(38);
        tree.root.left.left=new Node(18);
        tree.root.right.left=new Node(54);
        tree.root.right.right=new Node(72);
        System.out.println("inOrder Traversal of a Binary Search Tree");
        tree.inOrder(tree.root); 
        System.out.println();
    }
}
