/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for CRUD operations using linked list*/
/*The operations are Insert,Delete,Search, Destroy,Display*/
import java.util.Scanner;
public class VSDSinglyLinkedListCRUD{
	static Scanner sc=new Scanner(System.in);
	//Class to hold the structure of nodes
	 private static class VSDNode{
		int data;
		VSDNode next;
		VSDNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	//Head of LinkedList
	 static VSDNode head=null;
	//Function to insert element at the beginning of the List
	public static void VSDinsertAtBeginning() {
		System.out.println("Please Enter element to insert:");
		int element=sc.nextInt();
		VSDNode temp=new VSDNode(element);//making use of temporary node to insert 
		if(head==null)head=temp;//Inserting first element as head
		else {
			temp.next=head;
			head=temp;//Inserting new element and changing it as head
		}
		VSDprintList();
	}
	//Function to insert element at the end of the List
	public static void VSDinsertAtEnd() {
		System.out.println("Please Enter element to insert:");
		int element=sc.nextInt();
		VSDNode temp=new VSDNode(element);//making use of temporary node to insert 
		if(head==null)head=temp;//Inserting first element as head
		else {
			VSDNode x=head;//Temporary node to iterate over list and find last node
			while(x.next!=null) {
				x=x.next;
			}
			x.next=temp;//Inserting node at end of Linked list
			}
			VSDprintList();
			}
		//Function to insert element at the beginning of the List
		public static void VSDinsertAtMiddle() {
		System.out.println("Please Enter element to insert:");
		int element=sc.nextInt();
		VSDNode temp=new VSDNode(element);//making use of temporary node to insert 
		if(head==null)head=temp;
		else {
			System.out.println("Please Enter element from Linked list to insert after:");
			int num=sc.nextInt();
			VSDNode x=head;//Temporary node to iterate over list and found required node
			int flag=0;//To mark the presence of given element
			while(x!=null) {
				if(x.data==num) {
					flag=1;
					break;
				}
				x=x.next;
			}
			if(flag==0)
				System.out.println("The given element is not found in list");
			else {
				//inserting element at required place
				temp.next=x.next;
				x.next=temp;
				}
			}
			VSDprintList();
		}
		//Function to delete element from the list
		public static void VSDdelete(){
			if(head== null)//Checking if the list is null
			      System.out.println("Linked list is Empty!!!");
			else {
				System.out.println("Enter element to delete");
				int num=sc.nextInt();
				int flag=0;//To mark the presence of element
				if(head.data==num) {
					//If given element matches with head
					head=head.next;
					flag=1;
				}
				else {
					//Iterating over list to find the given element
				VSDNode x=head;
				while(x!=null) {
					if(x.next!=null&&x.next.data==num) {
						x.next=x.next.next;
						flag=1;
						break;
					}
					else if(x.next!=null)
					x=x.next;
					else
						break;
				}
				if(flag!=1)System.out.println("The given element is not found");
				}
				VSDprintList();
			}
		
		
		}
		//Function to search element in the list
		public static boolean VSDsearch(int element) {
			boolean b=false;
				VSDNode x=head;
					while(x!=null) {
					if(x.data==element)
						{
						b=true;
						break;
						}
					x=x.next;
				}
				return b;
				
			}
			

		//Function to destroy Linked List
		public static void VSDdestroy() {
			head=null;
			System.out.println("Linked List is destroyed");
			VSDuserChoice();
		}
		
		//Function to print the Linked List		
			public static void VSDprintList() {
						
						if(head== null)
						      System.out.println("Linked list is Empty!!!");
						else {
							System.out.println("Now the Linked List is");
						VSDNode x=head;
						while(x!=null) {
							System.out.print(x.data+"\t");
							x=x.next;
						}
						System.out.println();
						}
						
			}
			//Function to take user input for performing opearations
		public static void VSDuserInput() {
				System.out.println("Please Enter Linked List operation from:");
				System.out.println("Insert-begin,Insert-end,Insert-middle,Display,Delete,Search, Destroy" );
				String choice=sc.next();
				switch(choice) {
				case "Insert-begin":
				case "insert-begin":
					VSDinsertAtBeginning();break;
				case "Insert-end":
				case "insert-end":
					VSDinsertAtEnd();break;
				case "Insert-middle":
				case "insert-middle":
					VSDinsertAtMiddle();break;
				case "Display":
				case "display":
					VSDprintList();break;
				case "Delete":
				case "delete":
					VSDdelete();break;
				case "Search":
				case "search":
					System.out.println("Please Enter element to serach:");
					int element=sc.nextInt();
					if(head==null)System.out.println("List is empty!!, Insert elements to search");
					boolean b=VSDsearch(element);
					if(b)System.out.println("Element is present in list");
					else System.out.println("Element is not present in list ");break;
					
				case "Destroy":
				case "destroy":
					VSDdestroy();break;
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
			
			VSDuserInput();//Taking user input to perform CRUD operations on Linked List
		}
	}
