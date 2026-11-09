class Node {
	Object data;
	Node next;

	Node(Object data) {
		this.data = data;
		this.next = null;
	}
}

abstract class AbstractList {
	Node head;
	Node tail;

	public abstract void insert(Object data);
	public abstract void deleteTail();
	public abstract void display();
}

public class LinkedList extends AbstractList {

	@Override
	public void insert(Object data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		tail.next = newNode;
		tail = newNode;
	}

	@Override
	public void deleteTail() {
		if (head == null) {
			return;
		}

		if (head.next == null) {
			head = null;
			return;
		}

		Node current = head;
		while(current.next.next != null) {
			current = current.next;
		}

		current.next = null;
	}

	@Override
	public void display() {
		Node tail = head;

		while (tail != null) {
			System.out.print(tail.data + "->");
			tail = tail.next;
		}

		System.out.println("null");
	}
}
