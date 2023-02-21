// Copyrights to venkys.io
// For more programs visit venkys.io 
// Java program for Stack

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Stack {
    Node top;

    void push(int data) {
        if (top == null) {
            top = new Node(data);
            return;
        }
        Node temp = new Node(data);
        temp.next = top;
        top = temp;

    }

    void pop() {
        if (top == null)
            return;
        top = top.next;
    }

    void peek() {
        if (top == null)
            return;
        System.out.println(top.data);
    }

    void print() {
        Node temp = top;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.peek();
        s.print();
        s.pop();
        s.push(30);
        s.push(40);
        s.peek();
        s.print();

    }
}