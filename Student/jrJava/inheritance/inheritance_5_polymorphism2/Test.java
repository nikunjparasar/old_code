package jrJava.inheritance_5_polymorphism2;

public class Test {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		animal1.move();
		
		Animal animal2 = new Fish();
		animal2.move();
		
		Animal animal3 = new Bird();
		animal3.move();
		
		Animal animal4 = new Husky();
		animal4.move();
		
		Animal animal5 = new Retriever();
		animal5.move();
	}

}
