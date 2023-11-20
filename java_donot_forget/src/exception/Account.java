package exception;

public class Account {
	private String account;
	private double balance;
	private double interestRate;
	
	public Account() {
		super();
	}

	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return (balance * interestRate) / 100;
	}
	
	public void deposit(double money) throws Exception {
		if (money < 0) {
			throw new Exception ("입금 금액이 0보다 적습니다.");
		}
	}
	
	public void withdraw(double money) throws Exception{
		if (money < 0 || this.balance < money) {
			throw new Exception ("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}
	}

	String getAccount() {
		return account;
	}

	void setAccount(String account) {
		this.account = account;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	double getInterestRate() {
		return interestRate;
	}

	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
