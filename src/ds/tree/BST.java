package ds.tree;

public class BST {

	Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			left=null;
			right=null;
		}
	}
	
	public static void main(String[] args) {
		BST bst = new BST();
/*		bst.root = bst.insert(10, bst.root);
		bst.root = bst.insert(1, bst.root);
		bst.root = bst.insert(12, bst.root);
		bst.root = bst.insert(11, bst.root);
		bst.root = bst.insert(14, bst.root);*/
		bst.insert(10);
		bst.insert(1);
		bst.insert(12);
		bst.insert(11);
		bst.insert(14);
		bst.inOrder(bst.root);
	}
	
	void insert(int data){
		root = insert1(data,root);
	}
	
	void inOrder(Node node){
		if(node==null){
			return;
		}
		
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
	
	private Node insert1(int data, Node root){
		if(root==null){
			return new Node(data);
		}else if(data<root.data){
			root.left = insert1(data , root.left);
		}else if(data>root.data){
			root.right = insert1(data , root.right);
		}	
		return root;
	}
}
