package jrJava.multi_threading_3;

public class Calculator {

	public int sum = 0;
	//mutex lock
	public synchronized void calculateSum() {
		
		
		
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.println("TID:" + Thread.currentThread(). getId() + ", sum=" + sum); 
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { }
		}
		
	}
}
