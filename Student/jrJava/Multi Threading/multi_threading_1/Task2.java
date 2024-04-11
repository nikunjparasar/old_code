package jrJava.multi_threading_1;

public class Task2 {

	public static void main(String[] args) {
		
		SquareSumTask[] sst = new SquareSumTask[10];
		SquareRootSumTask[] srst = new SquareRootSumTask[10];

		for(int i=0; i<10; i++) {
			sst[i] = new SquareSumTask(i, i+10);
			srst[i] = new SquareRootSumTask(i, i+10);
		}
		
		Thread[] threads = new Thread[20];
		for(int i=0; i<10; i++) {
			threads[i] = new Thread(sst[i]);
			threads[10 + i] = new Thread(srst[i]);
		}
		
		// code
		// code
		
		for(int i=0; i<threads.length; i++) threads[i].start();
		
	}

}




