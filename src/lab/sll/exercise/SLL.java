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
		// TODO Auto-generated method stub
		
	}
	
	public void removeFirst() {
		// TODO Auto-generated method stub
		
	}

	public void removeLast() {
		// TODO Auto-generated method stub
		
	}
	
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	public int get(int index) {
		int element = 0;
		// TODO Auto-generated method stub
		return element;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean findElement(int data) {
		// TODO Auto-generated method stub
		return false;
	}

	public int countElement(int data) {
		int count = 0;
		// TODO Auto-generated method stub
		return count;
	}

	public int sumElement() {
		int sum = 0;
		// TODO Auto-generated method stub
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
