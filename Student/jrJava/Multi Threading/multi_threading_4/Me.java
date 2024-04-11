package jrJava.multi_threading_4;

public class Me {

	public static void main(String[] args) {
		
		BankA bankA = new BankA();
		BankB bankB = new BankB();
		
		System.out.println(bankB.getBalance());
		
		Transaction txn = new Transaction(bankA, bankB);
		
		for(int i=0; i<5; i++) {
			new Thread(txn).start();
		}
		
		/*
		txn.withdrawAll();
		txn.withdrawAll();
		txn.withdrawAll();
		txn.withdrawAll();
		txn.withdrawAll();
		*/
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) { }
		
		System.out.println(bankB.getBalance());
	}

}



