package lab.sll.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import lab.sll.exercise.SLL2;

class SLL2Test {
	
	private SLL2 sll;

	@Test
	void testGetSizeMethod() {
		sll = new SLL2();
		assertEquals(0, sll.getSize());
		sll.addFirst(1);
		assertEquals(1, sll.getSize());
		sll.removeFirst();
		assertEquals(0, sll.getSize());
		sll.addFirst(1);
		sll.addFirst(1);
		assertEquals(2, sll.getSize());
	}
	
	@Test
	void testIsEmptyMethod() {
		sll = new SLL2();
		assertTrue(sll.isEmpty());
		sll.addFirst(1);
		assertFalse(sll.isEmpty());
		sll.addFirst(2);
		assertFalse(sll.isEmpty());
		sll.removeFirst();
		assertFalse(sll.isEmpty());
		sll.removeFirst();
		assertTrue(sll.isEmpty());
	}
	
	@Test
	void testGetMethod() {
		sll = new SLL2();
		assertEquals(0, sll.get(0));
		sll.addFirst(5);
		sll.addLast(10);
		assertEquals(5, sll.get(0));
		assertEquals(10, sll.get(1));
		assertEquals(0, sll.get(100));
		sll.removeFirst();
		sll.removeFirst();
		assertEquals(0 ,sll.get(0));
	}
	
	@Test
	void testClearMethod() {
		sll = new SLL2();
		assertTrue(sll.isEmpty());
		sll.addFirst(10);
		sll.addLast(20);
		sll.addLast(30);
		assertFalse(sll.isEmpty());
		sll.clear();
		assertTrue(sll.isEmpty());
	}

}
