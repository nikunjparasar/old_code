package jrJava.multi_threading_3;

public class Task implements Runnable{
	private Calculator calculator;
	
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.calculateSum();
	}
}
