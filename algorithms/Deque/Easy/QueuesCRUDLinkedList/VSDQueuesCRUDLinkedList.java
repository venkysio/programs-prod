// Copyrights to venkys.io
// For more programs visit venkys.io 
// Java program for Queue

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Queue {
    Node head;
    Node tail;

    void enqueue(int data) {
        if (tail == null) {
            Node temp = new Node(data);
            tail = temp;
            head = temp;
        } else {
            Node temp = new Node(data);
            tail.next = temp;
            tail = temp;

        }
    }

    void dequeue() {
        if(head!=null){
            if(head==tail)tail=tail.next;
            head=head.next;        
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.print();
        q.dequeue();
        q.dequeue();
        q.print();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.print();
    }
}