package jrJava.tree_1;

import java.util.Stack;


public class Tree {

	private Node root;


	public void insert(int id, double value) {
		Node node = new Node(id, value);

		if(root==null) {
			root = node;
			return;
		}

		Node current = root;
		Node parent;

		while(true) {
			parent = current;

			if(id<current.id) {
				current = current.leftChild;
				if(current==null) {
					parent.leftChild = node;
					return;
				}
			}
			else {
				current = current.rightChild;
				if(current==null) {
					parent.rightChild = node;
					return;
				}
			}
		}
	}


	public Node find(int id) {
		if(root==null) return null;

		Node current = root;

		while(current.id!=id){
			if(id<current.id) current = current.leftChild;
			else current = current.rightChild;

			if(current==null) return null;
		}
		return current;
	}


	public boolean delete(int id) {
		if(root==null) return false;
		
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false; // Is current node left child or right child of the parent.
		
		while(current.id!=id) {
			
			parent = current;
			
			if(id<current.id) {
				current = current.leftChild;
				isLeftChild = true;
			}
			else {
				current = current.rightChild;
				isLeftChild = false;
			}
			
			if(current==null) return false;
		}
		
		// Current node is the delete node. Let's delete it.
		
		// Case 1: Delete node has no child.
		if(current.leftChild==null && current.rightChild==null) {
			if(current==root) root = null; 
			else if(isLeftChild) parent.leftChild = null;
			else parent.rightChild = null;
		}
		
		// Case 2: Delete node has only one child (left).
		
		if(current.leftChild!= null && current.rightChild == null) {
			if(current == root) root = current.leftChild;
			else if(isLeftChild) parent.leftChild = current.leftChild;
			else parent.rightChild = current.leftChild;
		}
		
		// Case 3: Delete node has only one child (right).
		if(current.leftChild == null && current.rightChild!= null) {
			if(current == root) root = current.rightChild;
			else if(isLeftChild) parent.leftChild = current.rightChild;
			else parent.rightChild = current.rightChild;
		}
		
		
		// Case 4: Delete node has both children.
		else {
/*
			Node temp = current.rightChild;
			Node tempParent = current;
			Node left = current.leftChild;
			Node right = current.rightChild;
			while(temp.leftChild!= null){
				tempParent = temp;
				temp = temp.leftChild;
			}
			
			if(temp.rightChild == null) {
				tempParent.leftChild = null;
			}
			else if(temp.rightChild != null) {
				tempParent.leftChild = temp.rightChild;
			}
			
			if(isLeftChild) {
				parent.leftChild = temp;
				temp.leftChild = left;
				if(right != temp) {
					temp.rightChild = right;
				}
			}
			else {
				parent.rightChild = temp;
				temp.leftChild = left;
				if(right != temp) {
					temp.rightChild = right;
				}
			}
		
*/
			Node sucessor = getSucessor(current);
			if(current == root) root = sucessor;
			else if(isLeftChild) {
				parent.leftChild = sucessor;
			}
			else {
				parent.rightChild = sucessor;
			}
			
			sucessor.leftChild = current.leftChild;
//			if(sucessor.rightChild == sucessor) {
//				sucessor.rightChild = null;
//			}
//			else {
//				sucessor.rightChild = current.rightChild;
//			}		
		}
		return true;
	}
	
	
	private Node getSucessor(Node deleteNode) {
		Node sucessor = deleteNode.rightChild;
		Node sucessorParent = deleteNode;
		while(sucessor.leftChild!= null){
			sucessorParent = sucessor;
			sucessor = sucessor.leftChild;
		}
	/*
		if(sucessor.rightChild == null) {
			sucessorParent.leftChild = null;
		}
		else {
			sucessorParent.rightChild = sucessor.rightChild;
		}
		*/
		if(sucessor!=deleteNode.rightChild) {
			sucessorParent.rightChild = sucessor.rightChild;
			sucessor.rightChild = deleteNode.rightChild;
		}	
		
		
		return sucessor;
	}
	
	public Node minimum() {
		if(root==null) return null;
		
		Node current = root;
		while(current.leftChild!=null) {
			current = current.leftChild;
		}
		return current;
	}
	
	
	public Node maximum() {
		if(root==null) return null;
		
		Node current = root;
		while(current.rightChild!=null) {
			current = current.rightChild;
		}
		return current;
	}
	
	
	public void printInOrder() {
		traverse(root);
	}


	private void traverse(Node node) {
		if(node==null) return;

		traverse(node.leftChild);
		System.out.println(node.id);
		traverse(node.rightChild);
	}

	public void traverseTopToBottom(){
		Stack<Node> main = new Stack<Node>();
		Stack<Node> children = new Stack<Node>();
		main.push(root);

		int ns = 64;

		boolean isRowEmpty = false;
		while(!isRowEmpty){

			for(int i=0; i<ns; i++) System.out.print(' ');

			isRowEmpty = true;
			while(!main.isEmpty()) {
				Node each = main.pop();

				if(each!=null){
					System.out.print(each.id);
					children.push(each.leftChild);
					children.push(each.rightChild);
					if(each.leftChild!=null || each.rightChild!=null) isRowEmpty = false;
				}
				else {
					System.out.print("--");
					children.push(null);
					children.push(null);
				}

				for(int i=0; i<2*ns-2; i++) System.out.print(' ');
			}

			ns /= 2;
			System.out.println("\n");
			while(!children.isEmpty()) main.push(children.pop());
		}


	}

}













