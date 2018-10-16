package stackQ;

/***
 * Implementing stack by Linked List
 * @author nishant
 * ###Proper####
 *
 */
public class Stk1 {

	Node top=null;
	
	static class Node{
		int data;
		//Node node;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
		public static void main(String[] args) {
			Stk1 stk = new Stk1();
			System.out.println(stk.isEmpty());
			stk.push(1);
			stk.push(2);
			stk.push(3);
			stk.push(4);
			System.out.println(stk.peak());
			stk.printStk();
			stk.pop();
			System.out.println("ssss");
			stk.printStk();
			System.out.println(stk.isEmpty());
		}
		
		void printStk(){
			Node t = top;
			while(t!=null){
				System.out.println(t.data);
				t=t.next;
			}
		}
		
		boolean isEmpty(){
			return (top==null);
		}
		
		void push(int x){
			Node newNode = new Node(x);
			newNode.next=top;
			top = newNode;
			
		}
		
		int pop(){
			int x = top.data;
			top=top.next;
			return x;
		}
		
		int peak(){
			return top.data;
		}
}
