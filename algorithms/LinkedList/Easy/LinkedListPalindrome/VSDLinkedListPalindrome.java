import java.util.Stack;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

public class Main{

    static Node createList(int[] llist){
        Node head=null,temp=null;
        for(int ele:llist){
            if(temp==null){
                temp=new Node(ele);
                head=temp;
            }
            else{
                temp.next=new Node(ele);
                temp=temp.next;
            }
        }
        return head;
    }

    static boolean chechPalindrome(Node head){
        Node temp=head;
        Stack<Integer> stack = new Stack<>();
        while(head!=null){
            stack.push(head.data);
            head=head.next;
        }
        while(temp!=null){
            if(temp.data!=stack.pop()) return false;
            temp=temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] llist = {10,20,30,20,10};
        Node head=createList(llist);
        System.out.println(chechPalindrome(head));

    }
}