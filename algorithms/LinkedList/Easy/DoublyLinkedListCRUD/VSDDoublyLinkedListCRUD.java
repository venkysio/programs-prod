class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

class DoubleLinkedList {
    Node head;
    int size = 0;

    void insert(int data) {
        if (head == null) {
            head = new Node(data);

            size++;
            return;
        }
        Node temp = new Node(data);
        temp.next = head;
        head.prev = temp;
        head = temp;
        size++;
        return;
    }

    void delete() {
        if (head == null)
            return;
        head = head.next;
        head.prev = null;
        size--;
        return;
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void size() {
        System.out.println(this.size);
    }
}

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList d = new DoubleLinkedList();
        d.insert(10);
        d.insert(20);
        d.print();
        d.delete();
        d.print();
        d.insert(30);
        d.insert(40);
        d.print();
        d.size();
    }
}