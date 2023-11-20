package sh.java.thread.synchronization.account;

/**
 * <pre>
 * 임계영역 Critical Section
 * - 멀티쓰레드환경에서 각쓰레드는 callstack만 따로 관리하고, heap, static등은 공유한다.
 * - 멀티쓰레드에서 한번에 한 쓰레드씩만 순서대로 접근해야하는 자원/코드영역
 * - 한 쓰레드씩 순서대로 접근하도록 하는 것이 동기화(Synchronization)
 * 
 * 동기화 처리
 * - 메모리의 객체영역에 대해 동기화. lock을 획득한 쓰레드만 접근가능
 * 1. synchronized 메소드 : 해당객체(this) 임계영역으로 설정
 * 2. synchronized 블럭 : 지정한 객체가 임계영역으로 설정
 * @author sisna
 *
 */

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account(1000);
		Thread th1 = new Thread(new ATM(acc), "ATM1");
		Thread th2 = new Thread(new ATM(acc), "ATM2");
		th1.start();
		th2.start();
	}

}
