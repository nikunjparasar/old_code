package jrJava.inheritance_6_polymorphism_dataStructure;

public class AnimalTrainer {
	
	public void train(Animal animal) {
		animal.move();
		animal.eat();
		
	}
	
	public void train(Animal[] animals) {
		for (int i = 0; i<animals.length; i++) {
			animals[i].move();
			animals[i].eat();
		}
	}
	
}
