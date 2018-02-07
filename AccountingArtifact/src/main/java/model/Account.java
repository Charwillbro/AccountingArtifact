package model;

public class Account {
	double balance;
	double interestRate;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public Account() {
		super();
	}

}
