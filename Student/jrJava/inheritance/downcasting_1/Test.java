package jrJava.downcasting_1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//case 1 :)
		Animal pet1 = new Husky();
		
		Husky pet2 = (Husky)pet1;
		
		pet2.pullSled();
		
		
		//case 2 :(
		//Animal pet3 = new Dog();
		//Husky pet4 = (Husky)pet3;
		//pet4.bark();
	
		//case 3 //cannot downcast from side to side, only down a tree of inheritance
		//Mammal pet5 = new Dog();
		//Bird pet6 = (Bird)pet5;
		// not possible
		
		
		//case4:
		//Animal pet7 = new Human();
		//Fish pet8 = (Fish)pet7;
		//possible, but not true
	
	}

}













































                                                                                                                                                                                                                                                                      