package sh.java.thread.control;

import javax.swing.JOptionPane;

/**
 * <pre>
 * 쓰레드의 생명주기
 * - NEW -> RUNNABLE -> TREMINATED
 * 		 -> WATING/BLOCKED
 * 
 * 쓰레드의 상태를 제어하는 api를 제공
 * - sleep
 * - join
 * - interrupt
 * - wait
 * - notify/notifyAll
 * @author sisna
 *
 */
public class ThreadControlStudy {

	public static void main(String[] args) {
		ThreadControlStudy study = new ThreadControlStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
		
		System.out.println(Thread.currentThread());
	}
	
	/**
	 * interrupt()
	 * - 특정쓰레드를 우회적으로 중지 (또는 다음액션) 처리할 수 있다.
	 */
	private void test4() {
		Thread th = new Thread(new CountDown(10));
		th.start();
		
		int result = JOptionPane.showConfirmDialog(null, "카운트 다운을 중지할까요?");
		System.out.println(result); // 예(0) 아니오(1) 취소 (2)
		if(result == 0) {
			th.interrupt(); // 해당 쓰레드에 InterruptedException이 던져짐
		}
	}
	
	/**
	 * join() 특정쓰레드를 기다리게 함
	 * - 끝날때까지 기다리기
	 * - 지정한 시간만큼만 기다리기
	 */
	private void test3() {
		Thread th = new Thread(new CountDown(10));
		th.start();
		
		try {
//			th.join(); // 현재 쓰레드에서 th쓰레드에 조인(끝날때까지 대기)
			th.join(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Daemon Thread
	 * - daemon은 유닉스/리눅스 os에서 백그라운드 프로세스를 가리키는 말.
	 * - 일반쓰레드의 보조적 업무를 수행하는 쓰레드
	 * - 모든 일반쓰레드가 종료되면, 데몬쓰레드는 자동으로 종료된다.
	 */
	private void test2() {
		Thread th = new Thread(new CountDown(10));
		th.setDaemon(true);
		th.start();
		
		JOptionPane.showMessageDialog(null, "확인을 누르면 메인쓰레드 종료!");
	}
	
	class CountDown implements Runnable {
		private int sec;
		
		public CountDown(int sec) {
			this.sec = sec;
		}
		
		@Override
		public void run() {
			for (int i = sec; i >= 0; i--) {
				System.out.println(i);
//				sleep(1000);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("누가 카운트다운을 멈추었는가?");
//					e.printStackTrace();
					break;
				}
			}
		}
	}
	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Thread#sleep
	 * 
	 * - thread는 각각의 callstack을 가진다.
	 * - main thread의 맨첫 메소드는 main이고, 다른 쓰레드의 맨 첫메소드는 run이다.
	 * - heap은 공유한다.
	 */
	private void test1() {
		Thread th = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread());
		});
		th.start();
	}

}
