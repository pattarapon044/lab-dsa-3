package exercise2;

class SLL {
	// ----------------------- Node --------------------
	private class Node {
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
		
		// when print as string
		public String toString() {
			return ""+element;
		}
	}
	// --------------------- End Node --------------------

	// SLL properties and methods
	private Node head = null;
	private Node tail = null;
	private int size = 0; // SLL's size

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
		// create new node
		Node first = new Node(data);
		//add new node to first
		if (size > 0) {
			first.link(head);
		}
		else {
			tail = first;
		}
		
		head = first;
		size ++;
	}

	public void removeFirst() {
		if (size > 0) {
			head = head.getNextNode();
			size --;
		}
	}

	public void removeLast() {
		Node current = head;
		if (size > 0) {
			for (int i = 1; i<size-1; size ++) {
				current = current.getNextNode();
			}
			current.link(null);
			tail = current;
			size --;
		}
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
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}
	
	public Node get(int index) {
		if (index >= size) {
			return null;
		}
		
		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.getNextNode();
		}
		
		return current;
	}
	
	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}
	
}