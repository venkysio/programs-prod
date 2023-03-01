
class Node{
    int data,height;
    Node left=null,right=null;
    Node(int data){
        this.data=data;
        this.height=1;
    }
}

class BalancedTree{
    
    int getHeight(Node root){
        if(root==null) return 0;
        return root.height;
    }

    int getBalance(Node root){
        if(root==null) return 0;
        return getHeight(root.left)-getHeight(root.right);
    }

    Node getMinValueNode(Node root){
        if(root.left==null) return root;
        return getMinValueNode(root.left);
    }

    Node leftRotate(Node z){
        Node y=z.right;
        Node t=y.left;
        y.left=z;
        z.right=t;
        z.height=1+Math.max(getHeight(z.left),getHeight(z.right));
        y.height=1+Math.max(getHeight(y.left),getHeight(y.right));
        return y;
    }

    Node rightRotate(Node z){
        Node y=z.left;
        Node t=y.right;
        y.right=z;
        z.left=t;
        z.height=1+Math.max(getHeight(z.left),getHeight(z.right));
        y.height=1+Math.max(getHeight(y.left),getHeight(y.right));
        return y;

    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    Node insert(Node root,int data){
        if(root==null) return new Node(data);
        else if(data<root.data)
            root.left=insert(root.left,data);
        else 
            root.right=insert(root.right,data);

        root.height = 1+Math.max(getHeight(root.left),getHeight(root.right));
        int balance = getBalance(root);
        if(balance>1){
            if(data<root.left.data)
                return rightRotate(root);
            else{
                root.left=leftRotate(root.left);
                return rightRotate(root);
            }                
        }
        if(balance<-1){
            if(data>root.right.data)
                return leftRotate(root);
            else{
                root.right=rightRotate(root.right);
                return leftRotate(root);
            }
        }
        return root;
    }

    Node delete(Node root,int data){
        if(root==null) return root;
        else if (data<root.data)
            root.left=delete(root.left,data);
        else if (data>root.data)
            root.right=delete(root.right,data);
        else{
            if(root.left == null){
                Node temp=root.right;
                root=null;
                return temp;
            }
            else if(root.right==null){
                Node temp=root.left;
                root=null;
                return temp;
            }
            Node temp = getMinValueNode(root.right);
            root.data=temp.data;
            root.right=delete(root.right,temp.data);

        }
        if(root==null) return root;
        root.height = 1+Math.max(getHeight(root.left),getHeight(root.right));
        int balance = getBalance(root);
        if(balance>1){
            if(getBalance(root.left)>=0)
                return rightRotate(root);
            else{
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
        }
        if(balance<-1){
            if(getBalance(root.right)<=0)
                return rightRotate(root);
            else{
                root.right=rightRotate(root.right);
                return leftRotate(root);
            }
        }
        return root;
    }
}

public class Main{
    public static void main(String[] args) {
        int arr[]={33, 13, 52, 9, 21, 61, 8, 11};
        Node root=null;
        BalancedTree tree = new BalancedTree();
        for(int i:arr)
            root=tree.insert(root, i);
        tree.inorder(root);
    }
}