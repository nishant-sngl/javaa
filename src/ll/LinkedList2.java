package ll;

public class LinkedList2 {

	Node head;
	
	static class Node{
		int data;
		Node next;
		public Node(int d) {
			// TODO Auto-generated constructor stub
			data = d;
		}
	}
	
	public static void main(String[] args) {
		LinkedList2 list = new LinkedList2();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		list.head = n1;
		n1.next = n2;
		n2.next = n3;
		list.printList();
		Node n = list.head;
		Node x = new Node(22);
		// at the end of LL
		while(n.next!=null){
			n=n.next;
		}
		n.next=x;
		x.next=null;
		list.printList();
		
		//at head
		Node x1 = new Node(11);
		Node h = list.head;
		x1.next=h;
		list.head=x1;
		list.printList();
		
		//at given loc
		
	}
	
	private void printList(){
		Node n = head;
		while(n!=null){
			System.out.println(n.data);
			n = n.next;
		}
	}
}

