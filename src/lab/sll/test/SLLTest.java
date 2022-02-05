package lab.sll.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import lab.sll.exercise.SLL;

class SLL1Test {
	
	private SLL sll;

	@Test
	void testAddValueFirst() {
		sll = new SLL();
		sll.addFirst(3);
		sll.addFirst(2);
		sll.addFirst(1);
		assertEquals("1->2->3->null", sll.toString());
	}
	
	@Test
	void testAddValueLast() {
		sll = new SLL();
		sll.addLast(3);
		sll.addLast(2);
		sll.addLast(1);
		assertEquals("3->2->1->null", sll.toString());
	}
	
	@Test
	void testRemoveFirst() {
		sll = new SLL();
		sll.addLast(1);
		sll.addLast(2);
		sll.addLast(3);
		sll.removeFirst();
		assertEquals("2->3->null", sll.toString());
	}
	
	@Test
	void testRemoveLast() {
		sll = new SLL();
		sll.addLast(1);
		sll.addLast(2);
		sll.addLast(3);
		sll.removeLast();
		assertEquals("1->2->null", sll.toString());
	}
	
	@Test
	void testGetSizeMethod() {
		sll = new SLL();
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
		sll = new SLL();
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
		sll = new SLL();
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
		sll = new SLL();
		assertTrue(sll.isEmpty());
		sll.addFirst(10);
		sll.addLast(20);
		sll.addLast(30);
		assertFalse(sll.isEmpty());
		sll.clear();
		assertTrue(sll.isEmpty());
	}

	@Test
	void testFindElement() {
		sll = new SLL();
		assertFalse(sll.findElement(0));
		sll.addFirst(1);
		sll.addLast(10);
		sll.addLast(15);
		assertTrue(sll.findElement(1));
		assertTrue(sll.findElement(10));
		assertTrue(sll.findElement(15));
		assertFalse(sll.findElement(20));
	}
	
	@Test
	void testFindCountElement(){
		sll = new SLL();
		sll.addFirst(1);
		sll.addLast(1);
		sll.addLast(5);
		assertEquals(0, sll.countElement(0));
		assertEquals(2, sll.countElement(1));
		assertEquals(1, sll.countElement(5));
	}
	
	@Test
	void testSumElement() {
		sll = new SLL();
		assertEquals(0, sll.sumElement());
		sll.addFirst(10);
		sll.addLast(20);
		sll.addLast(30);
		assertEquals(60, sll.sumElement());
	}
	
}
