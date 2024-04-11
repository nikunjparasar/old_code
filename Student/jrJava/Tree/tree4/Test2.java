package jrJava.tree4;

public class Test2 {

	public static void main(String[] args) {
		
		Tree<String> tree = new Tree<String>();
		
		tree.insert("mm");
		tree.insert("jj");
		tree.insert("pp");
		tree.insert("dd");
		tree.insert("nn");
		tree.insert("rr");
		tree.insert("cc");
		tree.insert("qq");
		tree.insert("ss");
		
		//tree.insert("bb");
		//tree.insert("aa");
	
		tree.traverseTopToBottom();
		System.out.println("\n\n");
		
		//tree.doInOrder();
		//tree.doPreOrder();
		tree.doPostOrder();
		
		//System.out.println(tree.getHeight());
		//System.out.println("\n\n");
		
		
		//tree.printInOrder();
		
		//tree.delete("nn");
		
		//System.out.println("\n\n");
		//tree.traverseTopToBottom();
	}

}








