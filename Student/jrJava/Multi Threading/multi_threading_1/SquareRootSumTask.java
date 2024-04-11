package jrJava.multi_threading_1;


public class SquareRootSumTask implements Runnable {

	private int begin, end;
	
	
	public SquareRootSumTask(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
	}
	
	public void run() {
		doTask();
	}
	
	public void doTask(){
		double sum = 0;
		
		for(int i=begin; i<=end; i++){
			sum += Math.sqrt(i);
			System.out.println("TID: " + Thread.currentThread().getId());
			System.out.println("in SquareRootSumTask: sum = " + sum);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { }
		}
	}
	
	
}
