/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Reverse Linked List*/
class ReverseLinkedList{
    Node head;
    //intializing Node 
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //method for reverse linked list
    public void reverseLinkedList(){
        if(head==null || head.next==null){
            return;
        }
        //place head to end position from beginning
        Node prev=head;
        Node curr=head.next;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
    }
    //adding element to begining of the linked list
    public void addFirst(int i){
        Node newNode=new Node(i);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //adding element to end of the linked list
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        //placing element at the end of linked list
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    //adding element to specific posistion of linked list
    public void addPos(int data,int pos){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        if(pos==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        //placing element in desired position
        int i=0;
        Node curr=head;
        while(i<pos-1 && curr.next!=null){
            curr=curr.next;i++;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }
    //method to printout linked list
    public void printOut(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    //main method
    public static void main(String args[]){
        ReverseLinkedList l=new ReverseLinkedList();
        l.addFirst(7);
        l.addFirst(6);
        l.addFirst(5);
        l.addFirst(4);
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);
        System.out.println("Original Linked list:");
        l.printOut();
        System.out.println("Reverse Linked List:");
        l.reverseLinkedList();
        l.printOut();
    }
}