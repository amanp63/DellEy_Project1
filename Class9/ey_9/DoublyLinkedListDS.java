package ey_9;

public class DoublyLinkedListDS {

	class Node {
		int data;
		Node previous;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head, tail = null;

	public void addItem(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	public void display() {
		Node current = head;

		if (head == null) {
			System.out.println("List is Empty");
			return;
		}

		System.out.println("Nodes of doubly linked list: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		
	}

	public static void main(String[] args) {
		DoublyLinkedListDS obj = new DoublyLinkedListDS();

		obj.addItem(10);
		obj.addItem(15);
		obj.addItem(20);
		obj.addItem(30);
		obj.addItem(40);
		

		obj.display();
	}
}