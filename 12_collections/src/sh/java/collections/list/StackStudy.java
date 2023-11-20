package sh.java.collections.list;

import java.util.Stack;

/**
 * <pre>
 * Stack 
 * - LIFO 방식의 선형 자료구조
 * - Last In First Out 후입선출 - 마지막에 들어온것이 먼저 나가는 구조
 *  
 * - Stack#push(T) 마지막에 요소추가 
 * - Stack#pop():T 마지막 요소 가져오기(제거)
 * - Stack#peek():T 마지막 요소 엿보기 
 *  
 * 2023-10-06
 * 
 */
public class StackStudy {
	private Stack<String> backwardHistory = new Stack<>();
	private Stack<String> forwardHistory = new Stack<>();
	private String current; // 현재 방문중인 url
	
	public static void main(String[] args) {
		StackStudy study = new StackStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}

	/**
	 * 브라우져의 뒤로가기/앞으로가기 구현
	 */
	private void test3() {
		goToUrl("https://naver.com");
		goToUrl("https://khacademy.com");
		goToUrl("https://google.com");
		printHistories();
		
		goBackward();
		goBackward();
		printHistories();
		
		goForward();
		goForward();
		printHistories();
	}
	
	private void goForward() {
		if(this.current != null)
			backwardHistory.push(current);
		this.current = forwardHistory.pop();
	}

	private void goBackward() {
		// 현재페이지는 앞으로가기 stack에 추가
		if(this.current != null)
			forwardHistory.push(this.current);
		this.current = backwardHistory.pop();
	}

	private void goToUrl(String url) {
		// 이전 방문페이지를 뒤로 가기 stack에 추가
		if(this.current != null)
			backwardHistory.push(this.current);
		
		this.current = url;
		
	}

	public void printHistories() { 
		System.out.println("뒤로 가기 : " + backwardHistory);
		System.out.println("현재페이지 : " + current);
		System.out.println("앞으로 가기 : " + forwardHistory);
	}

	/*
	
	public static void main(String[] args) {
		a();
		c();
	}
	public static void a() {
		b();
	}
	public static void b() {}
	public static void c() {}
	
	*/
	
	/**
	 * main -> a 호출 -> b 호출
	 * 		-> c 호출
	 * 
	 */
	private void test2() {
		Stack<String> callStack = new Stack<>();
		callStack.push("main");
		callStack.push("a");
		callStack.push("b");
		System.out.println(callStack); // [main, a, b]
		
		callStack.pop(); // b
		callStack.pop(); // a
		System.out.println(callStack); // [main]
		
		callStack.push("c");
		System.out.println(callStack); // [main, c]
		
		callStack.pop(); // c
		callStack.pop(); // main
		System.out.println(callStack); // []
		
	}

	/**
	 * 
	 */
	private void test1() {
		Stack<Integer> stack = new Stack<>();
		stack.push(50);
		stack.push(30);
		stack.push(77);
		
//		System.out.println(stack.pop()); // 77
//		System.out.println(stack.peek()); // 30
//		System.out.println(stack.pop()); // 30
//		System.out.println(stack.pop()); // 50
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println(stack);
		
	}

}
