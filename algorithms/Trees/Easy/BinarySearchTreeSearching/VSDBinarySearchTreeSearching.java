
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}

public class Main{

    static Node insertBST(Node root,int data){
        if(root==null) return new Node(data);
        if(root.data==data) return root;
        else if(data<root.data) root.left=insertBST(root.left,data);
        else root.right=insertBST(root.right,data);
        return root;
    }
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    
    static Node searchBST(Node root,int data){
        if(root==null) return null;
        if(root.data==data) return root;
        else if(data<root.data) return searchBST(root.left, data);
        else return searchBST(root.right, data);
    }
    public static void main(String[] args) {
        int[] arr={50,20,30,70,40,10};
        Node root=null;
        for(int i:arr){
            root=insertBST(root,i);
        }
        if(searchBST(root, 80)!=null) System.out.println("Found");
        else System.out.println("Not Found");        
    }
}