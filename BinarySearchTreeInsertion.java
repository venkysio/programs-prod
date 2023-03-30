/*Copyrights to venkys.io*/
/*For more programs visit venkys.io */
/*Java program for Binary Search Tree Insertion */
public class BinarySearchTreeInsertion {
    class Node{//Representing a Node of a Binary Search Tree
        int val;
        Node right;
        Node left;
        //constructor
        Node(int data){
            this.val=data;
            this.left=null;
            this.right=null;
        }
    }
    //intiating a root node 
    public Node root;
    BinarySearchTreeInsertion(){
        root=null;
    }  
    public void insert(int item){
        root =insertNode(root,item); //calling inserNode() method
    }
    //method to insert a node at correct position in BST
    public Node insertNode(Node root,int item){
        if(root==null){     //if root is null create a new Node
            root=new Node(item);
            return root;
        }
        if(item < root.val){//if item is less than the current value then traverse left subtree
            root.left= insertNode(root.left,item);
        }
        else if(item>root.val) {//if item is greater than the cureent value then traverse the right subtree
            root.right=insertNode(root.right,item);
        }
        return root;
    }
    //method to print In-order Traversal
    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
    }
    //main method
    public static void main(String[] args) {
        BinarySearchTreeInsertion tree=new BinarySearchTreeInsertion();
        tree.insert( 5);
        tree.insert(2);
        tree.insert( 8);
        tree.insert( 4);
        System.out.println("In order traversal of Tree:");
        tree.inOrder(tree.root);
        System.out.println();
    }
}


