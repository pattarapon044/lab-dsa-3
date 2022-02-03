package lab.sll.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import lab.sll.exercise.SLL3;

class SLL3Test {
	
	private SLL3 sll;
	
	@Test
	void testFindElement() {
		sll = new SLL3();
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
		sll = new SLL3();
		sll.addFirst(1);
		sll.addLast(1);
		sll.addLast(5);
		assertEquals(0, sll.countElement(0));
		assertEquals(2, sll.countElement(1));
		assertEquals(1, sll.countElement(5));
	}
	
	@Test
	void testSumElement() {
		sll = new SLL3();
		assertEquals(0, sll.sumElement());
		sll.addFirst(10);
		sll.addLast(20);
		sll.addLast(30);
		assertEquals(60, sll.sumElement());
	}
	
	

}
