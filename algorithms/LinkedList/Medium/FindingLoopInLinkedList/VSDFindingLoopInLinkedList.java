/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program to detect loop in a linked list*/
import java.util.*;;

public class VSDFindingLoopInLinkedList {
	//Clss to hold the structure of a node
	private static class VSDNode{
			int data;//data of node
			VSDNode next;//pointer to next elemnt in the list
			VSDNode(int data){
				this.data=data;
				this.next=null;
			}
	}
		static VSDNode head=null;
		//Function to insert elements into the linked list
	 public static void VSDinsert(int element) {
			VSDNode temp=new VSDNode(element);//making use of temporary node to insert 
			if(head==null)head=temp;//Inserting first element as head
			else {
				VSDNode x=head;//Temporary node to iterate over list and find last node
				while(x.next!=null) {
					x=x.next;
				}
				x.next=temp;//Inserting node at end of Linked list
			}
	 }
	 //Function to check whether the loop exists or not in a linked list
	 public static boolean VSDfindLoop() {
		 VSDNode cur=null;//Temporary node
		 if(head==null)System.out.println("The linked is empty");
		 else {
			 HashSet<VSDNode> h=new HashSet<VSDNode>();//Hash set to keep trck of elements in the list
			 cur=head;
			 //Itrating through the list
		 while(cur.next!=null) {
			 //adding elements to the hash set
			 h.add(cur);
			 //checking whether the element is repeated
			 if(h.contains(cur.next)) {
				 return true;
			 }
			 else
				 cur=cur.next;
		 }
		 }
		 return false;
		 
	 }
	 public static void main(String args[]) {
		 VSDinsert(10);
		 VSDinsert(11);
		 VSDinsert(12);
		 VSDinsert(13);
		 VSDinsert(14);
		 VSDinsert(15);
		 VSDinsert(16);
		 head.next.next=head;
		 boolean b=VSDfindLoop();
		 
		 if(b)System.out.println("The linked list contains a loop");
		 else System.out.println("The linked list does not contain a loop");
	 }
	}
