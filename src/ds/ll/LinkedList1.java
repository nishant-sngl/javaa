package ds.ll;

import java.util.HashSet;

public class LinkedList1 {

	Node head;
	
	static class Node{
		int data;
		Node next;
		public Node(int d) {
			// TODO Auto-generated constructor stub
			data=d;
			next=null;
		}
	}
	
	public static void main(String[] args) {
		insertion();
	}
	
	static void insertion(){
		LinkedList1 ll = new LinkedList1();
		Node fir = new Node(1);
		Node sec = new Node(2);
		Node third = new Node(3);
		Node four = new Node(4);
		Node fiv = new Node(5);
		ll.head = fir;
		fir.next = sec;
		sec.next = third;
		third.next = four;
		four.next = fiv;
		fiv.next = fir;
		ll.printList();
	}
	
	void printList(){
		Node n = head;
		HashSet<Node> set = new HashSet<>();
		int c = 0;
		while(true){
			if(set.contains(n)){
				break;
			}else{
				System.out.println(n.data);
				c++;
				set.add(n);
				n=n.next;
			}
		}
		System.out.println("count: " + c);
	}
}
