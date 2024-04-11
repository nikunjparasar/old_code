package jrJava.inheritance_6_polymorphism_dataStructure;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalTrainer trainer = new AnimalTrainer();
		
		//Animal myAnimal = new Fish();
		//trainer.train(myAnimal);
		
		Animal[] animals = new Animal[6];
		
		animals[0] = new Fish();
		animals[1] = new Dog();
		animals[2] = new Bird();
		animals[3] = new Human();
		animals[4] = new Husky();
		animals[5] = new Retriever();
		
		trainer.train(animals);
	
	
	}

}
