package lab.sll.exercise;

public class SLL {
	// ----------------------- Node --------------------
	public class Node {
		private int element;
		private Node next;

		// constructor
		public Node(int data) {
			element = data;
			next = null;
		}

		// link a new node to this node
		public void link(Node newNode) {
			next = newNode;
		}

		// return next node
		public Node getNextNode() {
			return next;
		}

		// return element of this node
		public int getElement() {
			return element;
		}
		
	}
	// --------------------- End Node --------------------

	// SLL properties and methods
	private Node head = null;
	private Node tail = null;
	private int size = 0; // SLL's size
	
	public Node[] toArray() {
		Node[] array = new Node[size];
		
		Node p = head;
		for (int i = 0; i < size; i++) {
			array[i] = p;
			p = p.getNextNode();
		}
		
		return array;
	}

	public void addLast(int data) {
		// create new node
		Node newNode = new Node(data);
		if (size == 0) {
			head = newNode;
		} else {
			tail.link(newNode);
		}
		tail = newNode;
		size++;
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (size == 0) {
			tail = newNode;
		}
		else {
			newNode.link(head);
		}
		head = newNode;
		size ++;
	}
	
	public void removeFirst() {
		if (size == 0) {
			return;
		}
		if (size == 1) {
			head = null;
			tail = null;
		}
		else {
			head = head.getNextNode();
		}
		size --;
	}

	public void removeLast() {
		
		if (size == 0) {
			return;
		}
		
		if (size == 1) {
			head = null;
			tail = null;
		}
		else {
			this.toArray()[size-2].link(null);
		}
		size --;
	}
	
	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public int get(int index) {
		if (index < size && index >= 0) {
			return this.toArray()[index].getElement();
		}
		return 0;
	}

	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean findElement(int data) {
		for (Node p:this.toArray()) {
			if (p.getElement() == data) {
				return true;
			}
		}
		return false;
	}

	public int countElement(int data) {
		int count = 0;
		for (Node p:this.toArray()) {
			if (p.getElement() == data) {
				count ++;
			}
		}
		return count;
	}

	public int sumElement() {
		int sum = 0;
		for (Node p:this.toArray()) {
			sum += p.getElement();
		}
		return sum;
	}

	public void print() {
		if (size == 0) {
			System.out.println("Empty linked list");
		} else {
			for (Node p = head; p != null; p = p.getNextNode()) {
				System.out.print(p.getElement() + "->");
			}
			System.out.println("null");
		}
	}

}
