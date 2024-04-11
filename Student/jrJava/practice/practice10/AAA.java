package jrJava.practice10;

public class AAA {

	public static void main(String[] args) {
		
		// How to call a method:
		// ClassName.methodName();
		// If the method happens to be in the same class,
		// we do not have to qualify by the className.
		
		
		BBB.saySomething();
		System.out.println();
		sayAnotherThing(); // AAA.sayAnotherThing();
		System.out.println();
		BBB.saySomething();
		System.out.println();
		sayAnotherThing();
	}

	
	
	public static void sayAnotherThing() {
		
		System.out.println("Another thing!");
	}
	
	
}
 