package stack;

public class Main {

	public static void main(String[] args) {
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
	}
}
