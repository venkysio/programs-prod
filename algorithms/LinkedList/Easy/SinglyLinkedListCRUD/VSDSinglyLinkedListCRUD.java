class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

class SingleLinkedList {
	Node head;
	int length = 0;

	void insert(int data) {
		if (head == null) {
			head = new Node(data);
			this.length++;
			return;
		}
		Node temp = new Node(data);
		this.length++;
		temp.next = head;
		head = temp;
		return;
	}

	void delete() {
		if (head == null)
			return;
		head = head.next;
		this.length--;
		return;

	}

	void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	};

	int size() {
		System.out.println(this.length);
		return this.length;
	};

}

public class Main {
	public static void main(String[] args) {
		SingleLinkedList s = new SingleLinkedList();
		s.insert(10);
		s.insert(20);
		s.print();
		s.delete();
		s.print();
		s.insert(30);
		s.insert(40);
		s.print();
		s.size();

	}
}