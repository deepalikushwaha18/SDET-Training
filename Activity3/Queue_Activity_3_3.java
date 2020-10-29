package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Activity_3_3 {

	public static void main(String[] args) {

//	    Create a Queue named q.
		Queue<Integer> q = new LinkedList<Integer>();
//	    Add first 5 natural numbers to it and print the Queue.
		for(int i=1;i<=5;i++) {
			q.add(i);
			
		}
		System.out.println("queue elements--"+q);
//	    Remove a number in the Queue using the remove() method.
		q.remove(2);
//	    Peek() at the first number in the Queue after removal.
           	
        System.out.println("head of queue: " + q.peek());
	
//	    Print the size of the Queue using the size() method.
		System.out.println("Size of queue---"+q.size());
//	    Print the updated Queue.

		System.out.println("updated queue---"+q);
	}

}
