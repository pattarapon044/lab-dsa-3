package lab.sll.test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import lab.sll.exercise.SLL1;

class SLL1Test {
	
	private SLL1 sll;

	@Test
	void testAddValueFirst() {
		sll = new SLL1();
		sll.addFirst(3);
		sll.addFirst(2);
		sll.addFirst(1);
		assertEquals("1->2->3->null", sll.toString());
	}
	
	@Test
	void testAddValueLast() {
		sll = new SLL1();
		sll.addLast(3);
		sll.addLast(2);
		sll.addLast(1);
		assertEquals("3->2->1->null", sll.toString());
	}
	
	@Test
	void testRemoveFirst() {
		sll = new SLL1();
		sll.addLast(1);
		sll.addLast(2);
		sll.addLast(3);
		sll.removeFirst();
		assertEquals("2->3->null", sll.toString());
	}
	
	@Test
	void testRemoveLast() {
		sll = new SLL1();
		sll.addLast(1);
		sll.addLast(2);
		sll.addLast(3);
		sll.removeLast();
		assertEquals("1->2->null", sll.toString());
	}

}
