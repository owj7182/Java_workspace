package sh.java.oop.constructor;

import java.time.LocalDate;


/**
 * <pre>
 * 생성자
 * - new연산자를 통해 호출하는 메소드.
 * - 객체생성에 있어 마지막 단계에 처리
 * - 필드값 초기화를 담당.
 * 
 * - 리턴타입이 없고, 메소드명과 클래스명은 동일해야 한다.
 * 
 * - 기본생성자(매개변수가 없음)
 * - 파라미터생성자(필요한 만큼 작성가능)
 * 
 * - JVM이 기본생성자를 자동생성 해준다.
 * - 만약 파라미터 생성자를 작성했다면, 기본생성자는 자동생성되지 않는다. (명시적으로 작성해야 한다.)
 * 
 * this
 * - 메소드안의 현재객체에 대한 숨은 참조
 * 
 * this()
 * - 다른 생성자를 호출!
 * - 맨첫줄에 1번만 사용이 가능함.
 *  
 * 2023-09-22
 * 
 */
public class User {
	private long id; 				// 회원번호
	private String username; 		// 아이디
	private String name; 			// 이름
	private LocalDate createdAt; 	// 회원등록일
	
	/**
	 * 기본생성자
	 */
	public User() {
		System.out.println("기본생성자 User() 호출!");
	}
	
	public User(long id, String username, String name) {
		// 다른 생성자를 호출 & 필드값설정!
		this(id, username, name, LocalDate.now());
//		this.id = id;
//		this.username = username;
//		this.name = name;
//		this.createdAt = LocalDate.now();
	}
	
	/**
	 * 파라미터 생성자
	 * @param id
	 * @param username
	 * @param name
	 * @param createdAt
	 */
	public User(long id, String username, String name, LocalDate createdAt) {
		this.id = id;
		this.username = username;
		this.name = name;
		this.createdAt = createdAt;
	}
	
	

	public void setId(long id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	public long getId() {
		return this.id;
	}
	public String getUsername() {
		return this.username;
	}
	public String getName() {
		return this.name;
	}
	public LocalDate getCreatedAt() {
		return this.createdAt;
	}
	
	public void printUser() {
		System.out.println(id +", " + username + ", " + name + ", " + createdAt);
	}
}
