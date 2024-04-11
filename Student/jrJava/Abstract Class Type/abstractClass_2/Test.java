package jrJava.abstractClass_2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Animal[] pets = new Animal[6];
		pets[0] = new Bird();
		pets[1] = new Human();
		pets[2] = new Retriever();
		pets[3] = new Husky();
		pets[4] = new Dog();
		pets[5] = new Fish();
	
		
		for(int i = 0; i<pets.length; i++) {
			pets[i].move();
		}
	}

	
	
}
