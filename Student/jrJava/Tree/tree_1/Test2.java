package jrJava.tree_1;

public class Test2 {

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		
		tree.insert(48, 0);
		tree.insert(25, 0);
		tree.insert(72, 0);
		tree.insert(11, 0);
		tree.insert(39, 0);
		tree.insert(33, 0);
		tree.insert(61, 0);
		tree.insert(21, 0);
		tree.insert(24, 0);
		tree.insert(36, 0);
		tree.insert(88, 0);
		tree.insert(44, 0);
		tree.insert(35, 0);
		tree.insert(38, 0);
		tree.insert(67, 0);
		
		tree.traverseTopToBottom();
		
		System.out.println("\n\n\n");
		
		tree.delete(25);
		tree.traverseTopToBottom();
		
		
		
		//tree.printInOrder();
		//System.out.println(tree.minimum());
		//System.out.println(tree.maximum());
	}

}






