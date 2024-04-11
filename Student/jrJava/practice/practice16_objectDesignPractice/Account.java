package jrJava.practice16_objectDesignPractice;

public class Account {

	public int accountID = 1001;
	public double balance= 100.0;
	public double interestRate = 0.05; // annual
	
	public Account() {}
	
	public Account(int accountID, double balance) {
		this.accountID = accountID;
		this.balance = balance;
	}
	
	public Account(int accountID, double balance, double interestRate) {
		this.accountID = accountID;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdrawAmount) {
		balance -= withdrawAmount;
	}
	
	public void applyInterest(int numOfMonths) {
		double monthlyInterestRate = interestRate/12;
		
		for (int i = 1; i <numOfMonths; i++) {
			balance = balance*(1+monthlyInterestRate);
		}
	}
}
