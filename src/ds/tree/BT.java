package ds.tree;

public class BT {

	Node root;

	static class Node{
		int key;
		Node left, right;
		public Node(int key) {
			this.key = key;
			left = right = null;
		}
	}
	
	public static void main(String[] args) {
		BT tree = new BT();
		tree.root = new Node(10);
		tree.root.left = new Node(11);
		tree.root.left.left = new Node(7);
		tree.root.right = new Node(9);
		tree.root.right.left = new Node(15);
		tree.root.right.right = new Node(8);
		
		System.out.println("In order traversal: ");
		tree.inOrder(tree.root);
		
		System.out.println("\n pre order traversal: ");
		tree.preOrder(tree.root);
		
		System.out.println("\n post order traversal: ");
		tree.postOrder(tree.root);
	}
	
	void inOrder(Node node){
		if(node==null){
			return;
		}
		
		inOrder(node.left);
		System.out.print(node.key + " ");
		inOrder(node.right);
	}
	
	void preOrder(Node node){
		if(node==null){
			return;
		}
		System.out.print(node.key + " ");
		inOrder(node.left);
		inOrder(node.right);
	}
	
	void postOrder(Node node){
		if(node==null){
			return;
		}
		inOrder(node.left);
		inOrder(node.right);
		System.out.print(node.key + " ");
	}
	
}


