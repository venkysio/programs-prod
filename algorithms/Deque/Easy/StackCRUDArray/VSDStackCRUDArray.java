class Stack {
    int top = -1;
    int size;
    int[] arr;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    void push(int data) {
        if (top == -1) {
            arr[0] = data;
            top = 0;
            return;
        }
        if (top > -1 && top < size) {
            arr[++top] = data;
            return;
        }
        System.out.println("Stack Overflow");
        return;

    }

    void pop() {
        if (top == -1) {
            System.out.println("Empty Stack");
            return;
        }
        arr[top--] = 0;
    }

    void peek() {
        if (top == -1)
            return;
        System.out.println(arr[top]);
        return;
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.peek();
        s.print();
        s.pop();
        s.pop();
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
    }
}