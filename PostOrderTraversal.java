/*Copyrights to venkys.io*/
/*For more programs visit venkys.io */
/*Java program for Post-order Traversal*/
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
class PostOrder{
    Node root;
    PostOrder(){
        root=null;
    }
    //method to find out the Post-order Traversal of Tree
    public void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val+" ");
        }
    }
}
public class PostOrderTraversal {
    public static void main(String[] args) {
        PostOrder tree=new PostOrder();
        //creating a binary search tree
        tree.root=new Node(50);
        tree.root.left=new Node(27);
        tree.root.right=new Node(63);
        tree.root.left.right=new Node(38);
        tree.root.left.left=new Node(18);
        tree.root.right.left=new Node(54);
        tree.root.right.right=new Node(72);
        System.out.println("PostOrder Traversal of a Binary Search Tree");
        tree.postOrder(tree.root); 
        System.out.println();
    }
}
