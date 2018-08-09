package ll;

import java.util.HashSet;

import ll.LinkedList1.Node;

/***
 * Impementing Linked List
 * ###Proper####
 * @author nishant
 *
 */
public class ll3 {

	Node head; 
	Node temp;
	
	static class Node{
		int data;
		Node next;
		public Node(int d) {
			data=d;
			next=null;
		}
	}

	public static void main(String[] args) {
		ll3 ll = new ll3();
		System.out.println("len: " + ll.len());
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.push(60);
		ll.push(100);
		ll.printList();
		System.out.println("search: " + ll.search(40,ll.head));
		
	}
	
	/***
	 * Print and count the Circular/loop list
	 */
	void circular(){
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
	/***
	 * Search by value
	 * @param x
	 * @return
	 */
	boolean search(int x, Node n){
		if(n.data==x)
			return true;
		if(n.next==null)
			return false;
		return search(x,n.next);
	}
	
	/***
	 * Search by value
	 * @param x
	 * @return
	 */
	boolean search(int x){
		Node t = head;
		while(t.data!=x && t.next!=null){
			t=t.next;
		}
		if(t.data==x){
			return true;
		}else if(t.next==null){
			return false;
		}
		return false;
	}
	
	/***
	 * To find the length of the linked list
	 * By recursion
	 * @return
	 */
	int len(Node n){
		if(n.next==null){
			return 1;
		}else{
			return 1+len(n.next);
		}
	}
	
	/***
	 * To find the length of the linked list
	 * @return
	 */
	int len(){
		Node t = head;
		int c=0;
		while(t!=null){
			c++;
			t=t.next;
		}
		return c;
	}
	
	/***
	 * Delete the node by its index.
	 * @param i
	 */
	void delByIndex(int i){
		int c = 1;
		Node t = head;
		if(i==1){
			head = head.next;
			return;
		}
		while(c!=i-1 && t.next!=null){
			t=t.next;
			c++;
		}
		if(t.next==null){
			System.out.println("no such index");
			return;
		}
		t.next=t.next.next;
	}
	
	/***
	 * Delete the node by its value.
	 * @param i
	 */
	void del(int key){
		Node t = head;
		if(t.data==key){
			head = head.next;
			return;
		}
		while(t.next.data!=key && t.next!=null){
			t=t.next;
		}
		t.next=t.next.next;
	}
	
	/***
	 * Insert a node after a given NODE.
	 * @param i
	 */
	void insert(Node ng, int x){
		Node n = new Node(x);
		Node t = head;
		while(t!=ng && t.next!=null){
			t=t.next;
		}
		if(t.next!=ng){
			n.next=t.next;
			t.next=n;
		}else if(t.next!=null){
			System.out.println("no such node");
		}
		
	}
	
	/***
	 * Insert a node at the front/left.
	 * Head will be on right most node.
	 * @param i
	 */
	void insert(int x){
		Node n = new Node(x);
		if(head==null){
			head=n;
			n.next=null;
		}else{
			n.next=head;
			head = n;
		}
	}
	
	/***
	 * Insert a node at the end/right.
	 * Head will be on left most node.
	 * @param i
	 */
	void push(int x){
		Node n = new Node(x);
		if(temp==null){
			head=n;
			temp=n;
			n.next=null;
		}else{
			temp.next=n;
			n.next=null;
			temp = temp.next;
		}
	}
	
	void printList(){
		Node n = head;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
	}
}
