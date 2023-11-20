package sh.java.thread.basic;

public class ThreadStudy {

	public static void main(String[] args) {
		ThreadStudy study = new ThreadStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
		System.out.println(Thread.currentThread().getName() + "종료!!!"); // main
	}
	/**
	 * 3의 배수 출력쓰레드(0.3초마다)와 4의 배수 출력쓰레드(0.4초마다)를 생성하고 실행
	 * - 두 쓰레드 모두 100미만만 출력
	 * -[3배수 쓰레드] 3
	 * -[3배수 쓰레드] 6
	 * -	[4배수 쓰레드] 4
	 * -[3배수 쓰레드] 9
	 * -	[4배수 쓰레드] 8
	 * -	[4배수 쓰레드] 12
	 * ...
	 * -[3배수 쓰레드] 99 종료!!
	 *  -	[4배수 쓰레드] 100종료!!
	 */
	private void test4() {
		Thread th1 = new MyThread() {
			int n = 3;
			@Override
			public void run() {
				int i = 1;
				int end = 100 / n;
				while(n * i <= 100) {
					System.out.println("[3배수 쓰레드]" + n * i);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.err.println((i == end ? " 3의 배수 종료!" : ""));
					i++;
				}
			}
		};
		
		Thread th2 = new MyThread() {
			int n = 4;
			@Override
			public void run() {
				int i = 1;
				int end = 100 / n;
				while(n * i <= 100) {
					System.out.println("     [4배수 쓰레드]" + n * i);
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.err.println((i == end ? " 4의 배수 종료!" : ""));
					i++;
				}
			}
		};
		th1.start();
		th2.start();
//		Thread th3 = new NThread(3);
//		Thread th4 = new NThread(4);
//		th3.start();
//		th4.start();
//	
//	}
//	
//	class NThread extends Thread {
//		private int n;
//		
//		public NThread(int n) {
//			this.n = n;
//		}
//	@Override
//	public void run() {
//		int i = 1;
//		int end = 100 / n;
//		while(n * i <= 100) {
//			System.out.print("[" + n + "배수 쓰레드]" + n * i);
//			System.out.println((i == end ? " 종료!" : ""));
//			i++;
//			try {
//				Thread.sleep(n * 100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}
//	}
	private void test3() {
		Thread th1 = new Thread(new YourThread());
//		Thread th2 = new Thread(new Runnable() {
			
//			@Override
//			public void run() {
//				b();
//				System.out.print(Thread.currentThread().getName() + "종료!!!");
//			}
//		});
		Thread th2 = new Thread(() -> {
			b();
			System.out.print(Thread.currentThread().getName() + "종료!!!");
		});
		th1.start();
		th2.start();
		
	}
	
	class YourThread implements Runnable {
		@Override
		public void run() {
			a();
			System.out.print(Thread.currentThread().getName() + "종료!!!");
		}
	}

	/**
	 * Runnable 구현방식
	 */
	/**
	 * 쓰레드 생성
	 * 1. Thread 상속
	 * 2. Runnable 구현
	 * 
	 * 쓰레드의 작업순서는 전적으로 OS스케쥴링 따르게 된다.
	 * 우선순위 지정은 가능하지만, 절대적인 것은 아니다.
	 */
	private void test2() {
		Thread th1 = new MyThread();
		th1.setName("마이쓰1");
		th1.setPriority(Thread.NORM_PRIORITY); // 10 Thread.NORM_PRIORITY 5
		
		Thread th2 = new Thread() {
			@Override
			public void run() {
				b();
				System.out.print(Thread.currentThread().getName() + "종료!!!");
			}
		};
		th2.setName("마이쓰2");	
		
		th1.start();
		th2.start();
		
	}
	
	public class MyThread extends Thread {
		@Override
		public void run() {
			a();
			System.out.print(Thread.currentThread().getName() + "종료!!!");
		}
	}
	/**
	 * 싱글 쓰레드
	 */
	private void test1() {
		a();
		b();
	}
	
	public void a() {
		for(int i = 0; i < 100; i++) {
			System.out.print("+");
		}
	}
	
	public void b() {
		for(int i = 0; i < 100; i++) {
			System.out.print("-");
		}
	}

}
