package sh.java.thread.synchronization.account;

public class Account {
	private long balance;
	
	public Account(long balance) {
		this.balance = balance;
	}
	
	public long getBalance() {
		return balance;
	}
	/**
	 * 1. synchronized 현재객체를 임계영역으로 지정 
	 * 2. synchronized블럭 지정객체를 임계영역으로 지정 (추천) - 임계영역을 더 작게 설정 가능
	 *  
	 * @param money
	 */
//	public synchronized void withraw(long money) {
	public void withraw(long money) {
		synchronized(this) {
			System.out.printf("[%s] %d원 출금시도 -> 현재잔액 %d원\n", 
					Thread.currentThread().getName(), 
					money, 
					balance);
			if(money <= balance) {
				balance -= money;
				System.out.printf("[%s] %d원 출금 -> 잔액 %d원\n", 
						Thread.currentThread().getName(), 
						money, 
						balance);
			}
			else {
				System.out.printf("[%s] %d원 출금시도 -> 잔액이 부족합니다.\n", 
						Thread.currentThread().getName(), 
						money);
			}
		}
	}
		

}
