
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}



public class Main{

    static void reverseLinkedList(Node head){
        Node temp=null,t;
        while(head!=null){
            t=head.next;
            head.next=temp;
            temp=head;
            head=t;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        reverseLinkedList(head);
    }
}