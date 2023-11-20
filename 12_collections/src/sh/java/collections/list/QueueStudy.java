package sh.java.collections.list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <pre>
 * FIFO을 지원하는 선형 자료구조
 * - First In First Out 선입선출
 * - Queue#offer(T) 마지막에 요소추가
 * - Queue#poll():T 맨앞의 요소 가져오기(제거)
 * 
 * 
 * 2023-10-06
 * 
 */
public class QueueStudy {

	public static void main(String[] args) {
		QueueStudy study = new QueueStudy();
		study.test1();
	}

	/**
	 * Queue객체는 Queue인터페이스를 구현한 LinkedList만 가능!
	 */
	private void test1() {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(30);
		queue.offer(50);
		queue.offer(25);
		queue.offer(7);
		
//		System.out.println(queue.poll()); // 30
//		System.out.println(queue.poll()); // 50
//		System.out.println(queue.poll()); // 25
//		System.out.println(queue.poll()); // 7
		
		// 모두 가져오기
		while(!queue.isEmpty()) {
			System.out.println(queue.poll()); 
		}

		System.out.println(queue);
		
	}

}
