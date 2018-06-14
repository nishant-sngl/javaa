package stackQ;

import java.util.concurrent.DelayQueue;

public class Main {

	/***
	 * main for stack
	 * @param args
	 */
/*	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("abcd");
		stack.push("abc");
		stack.push("ab");
		stack.push("a");
		stack.push("efgh");
		stack.push("efg");
		stack.push("ef");
		stack.push("e");
		stack.push("i");
		
		stack.show();
		
		System.out.println(stack.pop());
		stack.show();
		System.out.println(stack.pop());
		stack.show();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.show();
	}*/
	
	/***
	 * main for queue
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		Queue q = new Queue();
		q.enqueue(11);
		q.show();
		q.enqueue(21);
		q.show();
		q.enqueue(31);
		q.show();
		q.enqueue(41);
		q.show();
		q.enqueue(5);
		q.show();
	}
}
