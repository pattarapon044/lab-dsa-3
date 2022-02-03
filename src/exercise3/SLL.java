package exercise3;

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
		
		/**
		 * Use to format as print
		 */
		public String toString() {
			return ""+element;
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
	
	/**
	 * @return Size of SLL or numbers of node in SLL
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * @return Check is SLL have any node true or false
	 */
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Get node from index
	 * @param index
	 * @return the Node if it is exist
	 */
	public Node get(int index) {
		if (index < size && index >= 0) {
			int count = 0;
			for (Node p = head; p != null; p = p.getNextNode()) {
				if (count == index) {
					return p;
				}
				count ++;
			}
		}
		
		return null;
	}
	
	/**
	 * Clear all element in every node from SLL
	 */
	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}
	
	/**
	 * @return Array of every node in SLL
	 */
	public Node[] toArray() {
		Node[] array = new Node[size];
		
		int i = 0;
		for (Node p = head; p != null; p = p.getNextNode()) {
			array[i++] = p;
		}
		return array;
	}
	
	/**
	 * Find element in SLL
	 * @param element Data that you want to find
	 * @return
	 */
	public boolean findElement(int element) {
		
		if (size > 0) {
			for (Node p:this.toArray()) {
				if (p.getElement() == element) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	/**
	 * Find and count element in SLL
	 * @param element
	 * @return
	 */
	public int countElement(int element) {
		int count = 0;
		
		for (Node p:this.toArray()) {
			if (p.getElement() == element) {
				count ++;
			}
		}
		
		return count;
	}
	
	/**
	 * @return Sum of all element in SLL
	 */
	public int sumElement() {
		int sum = 0;
		
		for (Node p:this.toArray()) {
			sum += p.getElement();
		}
		
		return sum;
	}
	
}