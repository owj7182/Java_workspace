package sh.java.oop.account;

/**
 * <pre>
 * 계좌 클래스
 * - 이름
 * - 잔액
 * 
 * 캡슐화 이후에는 사용자(클라이언트)입장에서는 내부로직을 알필요없이 그냥 public 메소드만 호출해서 사용.
 * 
 * 
 * 캡슐화 원칙 3가지
 * - 상태/기능을 하나의 클래스 안에서 작성한다.
 * - 필드의 접근제한자는 private으로 지정한다.
 * - 기능(메소드 : 필드에 대한 연산)의 접근 제한자는 public으로 지정한다.
 * 
 * - 캡슐화 -> 은닉화
 * - 중요한 필드를 외부로부터 감추는 효과
 * 
 * 필드/기능 접근제한자
 * - private < default < protected < public 
 * - 폐쇄적 -------------------------- 개방적
 * - private : 같은 클래스 안에서만 접근
 * - public : 어디서나 접근
 * 
 * 메소드의 숨은 참조 this
 * - 현재객체를 가리키는 포인터
 * - this.필드명 : 현재객체의 필드
 * - 지역변수(메소드안에 선언된 변수)와의 이름충돌을 해결 
 * 
 * 
 * 2023-09-21
 *
 */
public class Account {
	private String name;
	private long balance;
	
	/**
	 * setter
	 * - set으로 시작, 대문자로 시작하는 필드명을 연결
	 * - 매개인자를 받아 필드값설정
	 * - 리턴타입은 항상 void
	 * - 매개변수는 필드의 자료형과 동일해야 한다.
	 * - name -> setName
	 * - userName -> setUserName
	 */
	public void setName(String name) {
		// 현재객체의 name필드
		this.name = name;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	/**
	 * getter 	
	 * - 필드값을 외부에 제공하기 위한 메소드
	 * - get으로 시작, 대문자로 시작하는 필드명을 연결
	 * - boolean타입인 경우는 예외적으로 is로 시작! boolean verified -> isVerified
	 * - 항상 리턴타입을 작성
	 * - 매개변수는 없음.
	 * 
	 */
	public String getName() {
		return this.name;
	}
	public long getBalance() {
		return this.balance;
	}
	
	/**
	 * 입금
	 */
	public void deposit(long money) {
		// 유효성검사
		if(money <= 0) {
			System.out.println("입금액이 유효하지 않습니다. : " + money);
			return;
		}
		
		balance += money;
	}
	
	/**
	 * 출금
	 * @param money
	 */
	public void withdraw(long money) {
		if(money <= 0) {
			System.out.println("출금액이 유효하지 않습니다. : " + money);
			return;
		}
		if(money > balance) {
			System.out.println("잔액이 모자랍니다...");
			return;
		}
		
		balance -= money;
	}
	
	public void printInfo() {
		System.out.println(name + "님의 현재 잔액 : " + balance);
	}
}
