package jrJava.multi_threading_1;

public class SquareSumTask implements Runnable {

	private int begin, end;
	
	
	public SquareSumTask(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	public void run() {
		doTask();
	}
	
	public void doTask(){
		int sum = 0;
		
		for(int i=begin; i<=end; i++){
			sum += i*i;
			System.out.println("TID: " + Thread.currentThread().getId());
			System.out.println("in SquareSumTask: sum = " + sum);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { }
		}
	}
	
} 
