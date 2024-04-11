package jrJava.constructors_and_inheritance_1;

public class B extends A{

	
	
	public int b;
	
	//if you don't put super constructor method, java puts it for 
	//us in the very first line of the constructor method.
	//It will call the default super constructor method.
	//If you put the super(...) call yourself,
	//make sure it will be the very first line in the
	//constructor method.
	public B() {
		super();
		b = 200;
	}
	
	public void mB() {
		System.out.println("Hello");
	}
	
}
