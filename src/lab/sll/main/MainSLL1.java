package lab.sll.main;

import lab.sll.exercise.SLL1;

//======================== Main Class ========================
public class MainSLL1 {
	public static void main(String[] args) {		
	    SLL1 sll = new SLL1();
	    sll.addFirst(2);
	    sll.addLast(3);
	    sll.addFirst(1);
	    sll.print();
	    sll.removeFirst();
	    sll.print();
	    sll.removeLast();
	    sll.print();
	}
}
