package model;

public class AccountLogic {

	public double setInterestRate(Account account) {
		double interestRate = 0;
		// interest rates
		double r1 = 0.1;
		double r2 = 0.2;
		double r3 = 0.3;
		// account threshholds
		int t1 = 1000;
		int t2 = 10000;
		int t3 = 100000;

		if (account.getBalance() < t1) {
			interestRate = r1;
		}
		if (account.getBalance() < t2) {
			interestRate = r2;
		}
		if (account.getBalance() > t3) {
			interestRate = r3;
		}
		return interestRate;
	}

	public Boolean isAccountEmpty(Account account) {
		Boolean isEmpty = true;

		if (account.getBalance() > 0) {
			isEmpty = false;
		}
		if (account.getBalance() <= 0) {
			isEmpty = true;
		}
		return isEmpty;
	}
}
