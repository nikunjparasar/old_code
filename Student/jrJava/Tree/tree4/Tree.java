package jrJava.tree4;

import java.util.Stack;

public class Tree<E extends Comparable<E>> {

	private Node<E> root; 

	
	// ---In-order, pre-order, post-order traversals ----
	
	public void doInOrder() {
		inOrder(root);
		System.out.println();
	}
	
	private void inOrder(Node<E> node) {
		if(node==null) return;
		
		inOrder(node.leftChild);
		System.out.print(node + " ");
		inOrder(node.rightChild);
	}
	
	public void doPreOrder() {
		preOrder(root);
	}
	
	private void preOrder(Node<E> node) {
		if(node==null) return;
		
		System.out.print(node + " ");
		preOrder(node.leftChild);
		preOrder(node.rightChild);
	}
	
	public void doPostOrder() {
		postOrder(root);
	}
	
	private void postOrder(Node<E> node) {
		if(node==null) return;
		
		postOrder(node.leftChild);
		postOrder(node.rightChild);
		System.out.print(node + " ");
	}
	
	// --------------------------------------------------
	
	
	public int getHeight() {
		return height(root);
	}
	
	private int height(Node<E> node) {
		if(node==null) return -1;
		return 1 + Math.max(height(node.leftChild), height(node.rightChild));
	}
	
	
	public int sum() {
		return sum(root);
	}
	
	
	private int sum(Node<E> node) {
		if(node==null) return 0;
		return (Integer)node.obj + sum(node.leftChild) + sum(node.rightChild);
	}
	
	
	
	public void printNodesAtLevel(int targetLevel) {
		traverseByLevel(root, 0, targetLevel);
		System.out.println();
	}
	
	
	private void traverseByLevel(Node<E> node, int level, int targetLevel) {
		
		if(node==null) return;
		
		if(level==targetLevel) {
			System.out.print(node + "  ");
			return;
		}
		
		traverseByLevel(node.leftChild, level+1, targetLevel);
		traverseByLevel(node.rightChild, level+1, targetLevel);
	}
	
	
	public void insert(E obj) {
		Node<E> node = new Node<E>(obj);
		if(root==null) {
			root = node;
			return;
		}

		Node<E> current = root;
		Node<E> parent;

		while(true) {
			parent = current;

			if(obj.compareTo(current.obj)<0) {
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


	public E find(E obj) {
		if(root==null) return null;

		Node<E> current = root;
		while(current.obj.compareTo(obj)!=0) {
			if(obj.compareTo(current.obj)<0) current = current.leftChild;
			else current = current.rightChild;

			if(current==null) return null;
		}
		return current.obj;
	}


	public E minimum() {
		if(root==null) return null;

		Node<E> current = root;
		while(current.leftChild!=null) {
			current = current.leftChild;
		}
		return current.obj;
	}


	public boolean delete(E obj) {
		if(root==null) return false;

		Node<E> parent = root;
		Node<E> current = root;
		boolean isLeftChild = false; // Is the current the left child 
		// or the right child of the parent?

		while(current.obj.compareTo(obj)!=0) {
			parent = current;

			if(obj.compareTo(current.obj)<0) {
				current = current.leftChild;
				isLeftChild = true;
			}
			else {
				current = current.rightChild;
				isLeftChild = false;
			}

			if(current==null) return false;
		}

		// Current node is the delete node.
		// Let's delete it.

		// Case 1: Delete node has no child.
		if(current.leftChild==null && current.rightChild==null) {
			if(current==root) root = null;
			else if(isLeftChild) parent.leftChild = null;
			else parent.rightChild = null;
		}

		// Case 2: Delete node has only one child (left).
		else if(current.rightChild==null){
			if(current==root) root = current.leftChild;
			else if(isLeftChild) parent.leftChild = current.leftChild;
			else parent.rightChild = current.leftChild;

		}

		// Case 3: Delete node has only one child (right).
		else if(current.leftChild==null){
			if(current==root) root = current.rightChild;
			else if(isLeftChild) parent.leftChild = current.rightChild;
			else parent.rightChild = current.rightChild;
		}

		// Case 4: Delete node has both children.
		else {
			Node<E> successor = getSuccessor(current);
			
			if(current==root) root = successor;
			else if(isLeftChild) parent.leftChild = successor;
			else parent.rightChild = successor;
			
			successor.leftChild = current.leftChild;
		}

		return true;
	}


	private Node<E> getSuccessor(Node<E> deleteNode) {
		
		Node<E> current = deleteNode.rightChild;
		Node<E> successor = deleteNode.rightChild;
		Node<E> successorParent = deleteNode.rightChild;
		
		while(current!=null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		
		if(successor!=deleteNode.rightChild) {	
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = deleteNode.rightChild;
		}
		
		return successor;
	}
	
	
	
	public E maximum() {
		if(root==null) return null;

		Node<E> current = root;
		while(current.rightChild!=null) {
			current = current.rightChild;
		}
		return current.obj;
	}



	public void printInOrder() {
		traverse(root);
	}


	public void traverse(Node node) {
		if(node==null) return;

		traverse(node.leftChild);
		System.out.println(node);
		traverse(node.rightChild);
	}



	public void traverseTopToBottom(){
		Stack<Node<E>> main = new Stack<Node<E>>();
		Stack<Node<E>> children = new Stack<Node<E>>();
		main.push(root);

		int ns = 64;

		boolean isRowEmpty = false;
		while(!isRowEmpty){

			for(int i=0; i<ns; i++) System.out.print(' ');

			isRowEmpty = true;
			while(!main.isEmpty()) {
				Node<E> each = main.pop();

				if(each!=null){
					System.out.print(each.obj);
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

	
	private static class Node<T> { 

		public T obj;
		
		public Node<T> leftChild;
		public Node<T> rightChild;
		
		public Node(T obj) {
			this.obj = obj;
		}
		
		public String toString() {
			return "{" + obj + "}"; 
		}
	}
	
}










