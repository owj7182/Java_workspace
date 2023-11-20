package sh.java.thread.synchronization.account;

public class ATM implements Runnable{
	private Account acc;
	
	public ATM(Account acc) {
		this.acc = acc;
	}
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int money = (int)(Math.random() * 3 + 1) * 100; // 100 200 300
			acc.withraw(money);
		}
		System.out.println(Thread.currentThread().getName() + " 종료!!");
	}
}
