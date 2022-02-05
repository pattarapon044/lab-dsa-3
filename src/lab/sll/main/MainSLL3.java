package lab.sll.main;

import lab.sll.exercise.SLL;

public class MainSLL3{
    public static void main(String[] args){
        SLL sll = new SLL();
        sll.addFirst(11);
        sll.addLast(22);
        sll.addLast(11);
        sll.print();
        
        System.out.println();
        System.out.println("Find element 11: "+sll.findElement(11));
        System.out.println("Find element 22: "+sll.findElement(22));
        System.out.println("Find element 33: "+sll.findElement(33));
        System.out.println("Count element 11: "+sll.countElement(11));
        System.out.println("Count element 22: "+sll.countElement(22));
        System.out.println("Count element 33: "+sll.countElement(33));
        System.out.println("Sum of all elements: "+sll.sumElement());       
    }
}
