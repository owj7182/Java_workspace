package sh.java.oop.constructor;

import java.time.LocalDate;

public class UserMain {

	public static void main(String[] args) {
		// 객체레시피
		// 클래스명 변수명 = new 생성자();
		User user1 = new User(); // The constructor User() is undefined
		user1.setId(1L);
		user1.setUsername("honggd");
		user1.setName("홍길동");
		user1.setCreatedAt(LocalDate.now());
		user1.printUser();
		
		User user2 = new User(2L, "sinsa", "신사임당", LocalDate.of(2023, 9, 21));
		user2.printUser();
		
		User user3 = new User(3L, "leess", "이순신");
		user3.printUser();
		
	}

}
