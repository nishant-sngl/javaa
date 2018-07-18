package ds.tree;

public class BT {

	Node root;
	public void BT(int key){
		root = new Node(key);
	}
	public void BT(){
		root = null;
	}
	
	public static void main(String[] args) {
		BT tree = new BT();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
	}
	
}

class Node{
	int key;
	Node left, right;
	public Node(int key) {
		this.key = key;
		left = right = null;
	}
}
