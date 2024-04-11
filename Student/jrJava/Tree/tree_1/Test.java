package jrJava.tree_1;

public class Test {

	public static void main(String[] args) {
		
		Tree tree = new Tree();

		tree.insert(55, 0.55);
		tree.insert(23, 0.23);
		tree.insert(15, 0.15);
		tree.insert(42, 0.42);
		tree.insert(79, 0.79);
		tree.insert(61, 0.61);
		tree.insert(88, 0.88);
		
		tree.printInOrder();
	}

}
