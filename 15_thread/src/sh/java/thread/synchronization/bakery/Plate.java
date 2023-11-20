package sh.java.thread.synchronization.bakery;

/**
 * <pre>
 * 
 * - wait() : 획득한 lock 반환하고, 쓰레드 자신을 임계영역의 waiting pool에 추가한다.
 * - notify() notify All : waiting pool에 대기중인 쓰레드 하나(전부)를 깨운다.
 * @author sisna
 *
 */
public class Plate {
	private int no; // 빵번호
	private boolean empty = true;
	
	/**
	 * Consumer용 메소드
	 */
	public synchronized void eatBread() {
		while(empty) {
			try {
				wait(); // BLOCKED
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("[%s] %d번 빵을 먹었습니다.\n",
				Thread.currentThread().getName(), no);
		this.empty = true;
		notify();
	}
	
	/**
	 * Baker용 메소드
	 */
	public synchronized void makeBread(int no) {
		while(!empty) {
			try {
				wait(); // BLOCKED
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.no = no;
		System.out.printf("[%s] %d번 빵을 구었습니다.\n",
				Thread.currentThread().getName(), no);
		this.empty = false;
		notify(); // waiting pool에 대기중인 쓰레드 하나에게 알림(InterruptedException 유발)
	}
}
