package jrJava.multi_threading_2;

public class Calculator {

	
	public void calculateSum() {
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.println("TID:" + Thread.currentThread(). getId() + ", sum=" + sum); 
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { }
		}
		
	}
}
