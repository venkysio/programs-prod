/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Program to find height of Binary Search Tree*/
import java.util.Scanner;
public class VSDHeightofBST {
	static Scanner sc=new Scanner(System.in);
	static int height;
	//Class to hold the structure of node in a tree
	public static class VSDNode{
		int data;//Holds the value of node
		int count;//Holds the count of duplicate nodes
		VSDNode left;//Holds the left pointer of node
		VSDNode right;//Holds the right pointer of node
		//Default constructor
		VSDNode(int data)
		{
			this.data =data;
			this.count=0;
			this.left = this.right = null;
		}
	}
	//Root node
	static VSDNode root;
	//Function to insert data into BST
	public static VSDNode VSDinsert(VSDNode root,int data) 
		{
			if(root==null) root=new VSDNode(data);
			if(data<root.data)root.left=VSDinsert(root.left,data);
			else if(data==root.data)root.count+=1;
			else root.right=VSDinsert(root.right,data);
			return root;
		}
	//Function to find height of tree
	public static int VSDfindHeight(VSDNode current) {
		//Checking if root is null
		if (current == null)
            return -1;
        else
        {
            int lh = VSDfindHeight(current.left);//height of left subtree
            int rh = VSDfindHeight(current.right);//height of right sub tree
			//returning maximum of left subtree height and right subtree height
            if (lh > rh)
                return (lh + 1);
             else
                return (rh + 1);
        }
		
		}
		
		//Function to perform inorder traversal
				public static void VSDinorder(VSDNode root) {
					 if(root.left!=null)VSDinorder(root.left);
					 System.out.println(root.data);
					 if(root.right!=null)VSDinorder(root.right);
					 }
		
		//Function to take user data
		public static int VSDreadData() {
			System.out.println("Enter data:");
			int data=sc.nextInt();
			return data;
		}
		//Function to take user input to perform BST operations
		public static void VSDuserInput() {
		System.out.println("Please Enter BST operation from:");
		System.out.println("Insert Inorder Height" );
		String choice=sc.next();
		switch(choice) {
			case "Insert":
			case "insert":
					int inval=VSDreadData();
					root=VSDinsert(root,inval);
					System.out.println("Data Inserted");
					break;
					case "Height":
					case "height":
						int h=VSDfindHeight(root);
						System.out.println("The height is:"+h);
						break;
					case "Inorder":
					case "inorder":
						//Initially checking if tree is empty
						if(root==null)
							System.out.println("Tree is empty, Insert elements to traverse");
						else
							VSDinorder(root);
						break;
				}
					VSDuserChoice();
				}
			public static void VSDuserChoice() {
					System.out.println("For performing operations enter y else enter n");
					char ch=sc.next().charAt(0);
					if(ch=='Y'||ch=='y')
						VSDuserInput();
					else return;
				}
			public static void main(String args[]) {
				VSDuserInput();
				
			}
	}
