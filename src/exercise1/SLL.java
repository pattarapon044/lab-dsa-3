package exercise1;

class SLL {
	// ----------------------- Node --------------------
	private class Node {
		
		// Node attribute
		private int element;
		private Node next;
		private Node previous;

		/**
		 * Initialize data to class properties
		 * 
		 * @param data
		 */
		public Node(int data) {
			element = data;
			next = null;
			previous = null;
		}

		/**
		 * Link this node to other node
		 * 
		 * @param newNode
		 */
		public void link(Node newNode) {
			next = newNode;
			
			if (next != null) {
				next.setPreviousNode(this);
			}
		}

		/**
		 * @return Next node that be linked by this node
		 */
		public Node getNextNode() {
			return next;
		}
		
		/**
		 * Set some node as previous of this node
		 * 
		 * @param previousNode
		 */
		public void setPreviousNode(Node previousNode) {
			previous = previousNode;
		}
		
		/**
		 * @return Previous Node
		 */
		public Node getPreviousNode() {
			return previous;
		}

		/**
		 * @return element of this node
		 */
		public int getElement() {
			return element;
		}
	}
	// --------------------- End Node --------------------
	
	// SLL properties and methods
	private Node head = null;
	private Node tail = null;
	private int size = 0; // SLL's size
	
	/**
	 * Add data to new node and append node to the last node
	 * 
	 * @param data
	 */
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
	
	/**
	 * Add data to new node and append the node to the first node
	 * 
	 * @param data 
	 */
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
	
	/**
	 * Remove first Node from SLL
	 */
	public void removeFirst() {
		if (size > 0) {
			head = head.getNextNode();
			size --;
		}
	}
	
	/**
	 * Remove last Node from SLL
	 */
	public void removeLast() {
		
		if (size == 0) {
			return;
		}
		
		if (size == 1) {
			head = null;
			tail = null;
		}
		
		if (size > 1) {
			tail = tail.getPreviousNode();
			tail.link(null);
		}
		
		size--;
	}
	
	/**
	 * This method is override from base object to format this class toString When call print
	 *
	 * @return The line of nodes that in SLL
	 */
	public String toString() {
		// If node empty
		if (size == 0) {
			return "Empty linked list";
		}
		
		// If have nodes
		String node = "";
		for (Node p = head; p != null; p = p.getNextNode()) {
			node += p.getElement() + "->";
		}
		
		node += "null";
		return node;
	}
	
	/**
	 * Print out each nodes in this SLL
	 */
	public void print() {
		System.out.println(this);
	}
	
}