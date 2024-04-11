package jrJava.multi_threading_3;

public class Dispatcher {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		Task task = new Task();
		task.setCalculator(calculator);
		
		Thread[] threads  = new Thread[10];
		
		for(int i = 0; i<threads.length; i++) {
			threads[i] = new Thread(task);
			threads[i].start();
		}
		
		
	}
}
