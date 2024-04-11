package jrJava.multi_threading_1;

public class Task {

	public static void main(String[] args) {
		
		SquareSumTask sst = new SquareSumTask(1, 10);
		SquareRootSumTask srst = new SquareRootSumTask(1, 10);
		
		Thread t2 = new Thread(sst);
		Thread t3 = new Thread(srst);
		// code
		// code
		// code
		
		t2.start();
		
		t3.start();
		
		int sum = 0;
		for(int i=1; i<=10; i++){
			sum += i;
			System.out.println("TID: " + Thread.currentThread().getId());
			System.out.println(" in Task: sum = " + sum);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { }
		}
		
	}

}
