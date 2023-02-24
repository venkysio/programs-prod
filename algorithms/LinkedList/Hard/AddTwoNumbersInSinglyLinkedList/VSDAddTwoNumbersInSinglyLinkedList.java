

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}



public class Main{

    static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    static Node buildll(int[] arr){
        Node temp=new Node(0);
        Node head=temp;
        for(int i=0;i<arr.length;i++){
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return head.next;
    }

    static Node addTwoNumbers(Node l1,Node l2){
        Node temp=new Node(0);
        Node head=temp;

        int c=0;
        while(l1!=null || l2!=null || c!=0){
            if(l1!=null){
                c+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                c+=l2.data;
                l2=l2.next;
            }
            temp.next=new Node(c%10);
            c=c/10;
            temp=temp.next;
        }
        return head.next;

    }
    public static void main(String[] args) {
        int[] a1=new int[]{2,4,3};
        int[] a2=new int[]{5,6,4};
        Node l1=buildll(a1);
        Node l2=buildll(a2);

        Node ans=addTwoNumbers(l1, l2);
        print(ans);
        
    }
}