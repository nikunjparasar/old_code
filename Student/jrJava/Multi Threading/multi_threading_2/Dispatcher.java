package jrJava.multi_threading_2;

public class Dispatcher {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();

		Task1 task1 = new Task1();
		Task2 task2 = new Task2();
		
		task1.setCalculator(calculator);
		task2.setCalculator(calculator);
		
		new Thread(task1).start();
		new Thread(task2).start();
	}

}
