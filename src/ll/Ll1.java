package ll;

public class Ll1 {

	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public static void main(String[] args) {
	
		Ll1 ll = new Ll1();
		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		ll.head.next = second;
		second.next = third;
		
		ll.printLl();
	}
	
	public void printLl(){
		Node n = head;
		while(n!=null){
			System.out.println(n.data);
			n = n.next;
		}
	}
}
