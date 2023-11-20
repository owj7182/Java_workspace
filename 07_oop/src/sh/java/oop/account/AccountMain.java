package sh.java.oop.account;

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account();
//		acc.name = "홍길동";
//		acc.balance = 1_000_000;
		acc.setName("홍길동");
		acc.setBalance(1_000_000);
		acc.printInfo();
		
		// 입금
//		acc.balance *= 500_000;
		acc.deposit(500_000);
		acc.printInfo();
		
		// 출금
//		acc.balance -= -300_000;
		acc.withdraw(300_000);
		acc.withdraw(30_000_000); // 잔액부족
		acc.printInfo();
		
		// getter
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());
		
	}

}
