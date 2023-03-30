/*Copyrights to venkys.io*/
/*For more programs visit venkys.io */
/*Java program for Binary Search Tree Deletion */
class Node{/*Representing a Node of a Binary Search Tree*/
    int val;
    Node left;
    Node right;
    //constructor
    Node(int data){
        this.val=data;
        this.right=null;
        this.left=null;
    }
}
class BSTDeletion{
    Node root;
    BSTDeletion(){
        root=null;
    }
    public void delete(int data){
        //calling deleteNode() method
        root=deleteNode(root,data);
    }
    public Node deleteNode(Node root,int data){
        if(root==null){
            return root;
        }
        //if value if greater than current value
        if(data>root.val){
            root.right=deleteNode(root.right,data);
        }
        else{
            //if node having max one child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            // if node having two children then get the inOrder predecessor of node
            root.val=minimumValue(root.left);
            //delete the inOrder predecessor
            root.left=deleteNode(root.left, root.val);
        }
        return root;
    }
    //get minimum element in binary search tree
    public int minimumValue(Node root){
        int min;
        for(min=root.val;root.right!=null;root=root.right){
            min=root.val;
        }
        return min;
    }
    //method to print In-order Traversal of BST
    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
    }
}
class BinarySearchTreeDeletion{
    //main method
    public static void main(String[] args) {
        BSTDeletion tree=new BSTDeletion();
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
        tree.delete(60);
        System.out.println();
        System.out.println("inOrder Traversal After deleting a Node 60");
        tree.inOrder(tree.root); 
        tree.delete(50);
        System.out.println();
        System.out.println("inOrder Traversal After deleting a Node 50");
        tree.inOrder(tree.root);
        tree.delete(80);
        System.out.println();
        System.out.println("inOrder Traversal After deleting a Node 80"); 
        tree.inOrder(tree.root);
    }
}
