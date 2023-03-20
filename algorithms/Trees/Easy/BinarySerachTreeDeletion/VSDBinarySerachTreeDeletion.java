
class Node {
    int data;
    Node left=null, right=null;

    Node(int data) {
        this.data = data;
    }
}

public class Main {

    static Node insertBST(Node root, int data) {
        if (root == null)
            return new Node(data);
        if (root.data == data)
            return root;
        else if (data < root.data)
            root.left = insertBST(root.left, data);
        else
            root.right = insertBST(root.right, data);
        return root;
    }

    static Node minValue(Node root) {
        Node temp = root;
        while (temp.left != null)
            temp = temp.left;
        return temp;
    }

    static Node deleteBST(Node root, int data) {
        if (root == null)
            return root;
        if (data < root.data)
            root.left = deleteBST(root.left, data);
        else if (data > root.data)
            root.right = deleteBST(root.right, data);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            Node temp = minValue(root.right);
            root.data = temp.data;
            root.right = deleteBST(root.right, temp.data);
        }
        return root;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

   

    public static void main(String[] args) {
        int[] arr = { 50, 20, 30, 70, 40, 10 };
        Node root = null;
        for (int i : arr) {
            root = insertBST(root, i);
        }
        inorder(root);
        System.out.println();
        root = deleteBST(root, 20);
        inorder(root);

    }
}