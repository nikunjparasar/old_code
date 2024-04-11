package jrJava.multi_threading_4;

public class BankA {

	private double balance = 1000000;
	
	public double getBalance() { return balance; }
	
	public synchronized void withdraw(double request, BankB bankB) {
		
		if(balance==0 || request>balance) {
			System.out.println("Not sufficient fund!");
			return;
		}
		
		// check HLS server.
		// check ATF server.
		// check DEA server.
		// check against liens.
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) { }
		
		balance -= request;
		bankB.deposit(request);
		
		return;
	}
}

