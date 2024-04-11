package jrJava.practice16_objectDesignPractice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account tom = new Account(1023, 350.99, 0.09);
		Account dick = new Account(1024, 700.0); 
		Account harry = new Account();
		Account sally = new Account(1055,1500.50, 0.04);
	
		
		
		dick.deposit(100);
		harry.withdraw(58.10);
		
		tom.applyInterest(12);
		dick.applyInterest(12);
		harry.applyInterest(12);
		sally.applyInterest(12);
		
		
		System.out.println("Tom:" + tom.getBalance());//System.out.println(tom.balance);
		System.out.println("Dick:" + dick.getBalance());
		System.out.println("Harry:" + harry.getBalance());
		System.out.println("Sally" + sally.getBalance());
	}

}
