public class SLL3 {
	
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
			Node newNode = new Node(data);
			
			if (size == 0) {
				tail = newNode;
			}
			else{
				newNode.link(head);
			}
			
			head = newNode;
			size ++;
		}
		
		public void removeFirst() {
			// TODO Auto-generated method stub
			if (size == 0) {
				return;
			}
			
			if (size == 1) {
				head = null;
				tail= null;
			}
			else {
				head = head.getNextNode();
			}
			size --;
		}

		public void removeLast() {
			// TODO Auto-generated method stub
			if (size == 0) {
				return;
			}
			
			if (size == 1) {
				head = null;
				tail = null;
			}
			else {
				
				for (Node p = head; p != null; p = p.getNextNode()) {
				 	if (p.getNextNode().getNextNode() == null) {
				 		p.link(null);
				 	}
				}
			}
			
			size --;
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
			// TODO Auto-generated method stub
			return size;
		}

		public boolean isEmpty() {
			// TODO Auto-generated method stub
			if (size == 0) {
				return true;
			}
			
			return false;
		}

		public int get(int index) {
			int element = 0;
			// TODO Auto-generated method stub
			if (index >= 0 && index < size) {
				int i = 0;
				for (Node p = head; p != null; p = p.getNextNode()) {
					if (i++ == index) {
						return p.getElement();
					}
				}
			}
			
			return element;
		}

		public void clear() {
			// TODO Auto-generated method stub
			head = null;
			tail = null;
			size = 0;
		}
		
		public boolean findElement(int element) {
			// TODO Auto-generated method stub
			for (Node p = head; p!= null; p = p.getNextNode()) {
				if (p.getElement() == element) {
					return true;
				}
			}
			
			return false;
		}

		public int countElement(int element) {
			int count = 0;
			// TODO Auto-generated method stub
			for (Node p = head; p!= null; p = p.getNextNode()) {
				if (p.getElement() == element) {
					count++;
				}
			}
			return count;
		}

		public int sumElement() {
			int sum = 0;
			// TODO Auto-generated method stub
			for (Node p = head; p!= null; p = p.getNextNode()) {
				sum += p.getElement();
			}
			return sum;
		}
}

