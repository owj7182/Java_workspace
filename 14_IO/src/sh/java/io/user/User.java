package sh.java.io.user;

import java.io.Serializable;
import java.time.LocalDateTime;

public class User implements Serializable{
	/**
	 * 객체 입출력시에 정확한 타입인지를 체크하는 식별값
	 * - 부여하지 않는다면, random하게 처리됨.
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String username;
	private transient String password; // transient 객체 입출력시 값을 제외함.
	private LocalDateTime createdAT;

	public User() {
		super();
	}

	public User(String username, String password, LocalDateTime createdAT) {
		super();
		this.username = username;
		this.password = password;
		this.createdAT = createdAT;
	}

	String getUsername() {
		return username;
	}

	void setUsername(String username) {
		this.username = username;
	}

	String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	LocalDateTime getCreatedAT() {
		return createdAT;
	}

	void setCreatedAT(LocalDateTime createdAT) {
		this.createdAT = createdAT;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", createdAT=" + createdAT + "]";
	}
	
	
}
