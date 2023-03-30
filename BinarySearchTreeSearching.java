/*Copyrights to venkys.io*/
/*For more programs visit venkys.io */
/*Java program for Binary Search Tree Searching*/
class Node {/* Representing a Node of a Binary Search Tree */
    int val;
    Node left;
    Node right;

    // constructor
    Node(int data) {
        this.val = data;
        this.right = null;
        this.left = null;
    }
}

class BSTSearching {
    Node root;

    BSTSearching() {
        root = null;
    }

    public Node searchNode(Node root, int item) {
        if (root == null) { 
            return null;
        }
        //return root if root value is equal to item 
        else if(root.val==item){
            return root;
        }
        // if item is less than the current value then traverse left subtree
        else if (item < root.val) {
            return searchNode(root.left, item);
        } 
        // if item is greater than the cureent value then traverse the right subtree
        else{
            return searchNode(root.right, item);
        }
    }
}

class BinarySearchTreeSearching {
    // main method
    public static void main(String[] args) {
        BSTSearching tree = new BSTSearching();
        // creating a binary search tree
        tree.root = new Node(50);
        tree.root.left = new Node(27);
        tree.root.right = new Node(63);
        tree.root.left.right = new Node(38);
        tree.root.left.left = new Node(18);
        tree.root.right.left = new Node(54);
        tree.root.right.right = new Node(72);
        Node node=tree.searchNode(tree.root, 18);
        if(node!=null){
            System.out.println(node.val+" found in  binary tree");
        }
        else{
            System.out.println("Element not found in binary tree");
        }
        
    }
}
