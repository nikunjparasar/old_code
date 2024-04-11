package jrJava.multi_threading_2;

public class Task2 implements Runnable {

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void run() {
		doTask();
	}
	
	public void doTask() {
		calculator.calculateSum();
	}
	
}
