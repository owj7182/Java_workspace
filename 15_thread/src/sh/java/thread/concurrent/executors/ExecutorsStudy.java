package sh.java.thread.concurrent.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <pre>
 * concurrent api
 * - jdk5부터 멀티쓰레드/동기화처리를 지원하는 유틸리티 클래스 모음
 * - Executors를 통해 쓰레드풀(thread pool) 처리를 지원
 * - 쓰레드 생성/삭제 비용이 크기 때문에 생성한 쓰레드를 재사용 가능하도록 함.
 * 
 * @author sisna
 *
 */
public class ExecutorsStudy {

	public static void main(String[] args) {
		ExecutorsStudy study = new ExecutorsStudy();
		study.test1();
	}
	
	private void test1() {
		ExecutorService service = Executors.newFixedThreadPool(5);
		// executor service객체에 할일을 지정
		
		for(int i = 0; i < 100; i++) {
		service.submit(() -> System.out.println(Thread.currentThread().getName()));
	
		}
		// 종료
		service.shutdown();
	}
}
