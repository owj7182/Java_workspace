package com.sh.collections.map.member;

import java.util.Objects;

public class Memmber {
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private String phoneNumber;
	
	public Memmber() {
		super();
	}

	public Memmber(String userId, String userPwd, String userName, int age, String phoneNumber) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	String getUserId() {
		return userId;
	}

	void setUserId(String userId) {
		this.userId = userId;
	}

	String getUserPwd() {
		return userPwd;
	}

	void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	String getUserName() {
		return userName;
	}

	void setUserName(String userName) {
		this.userName = userName;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getPhoneNumber() {
		return phoneNumber;
	}

	void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return userId+ "  " + userPwd + "  " + userName + "  " + age + "  " + phoneNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, phoneNumber, userId, userName, userPwd);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Memmber other = (Memmber) obj;
		return age == other.age && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(userId, other.userId) && Objects.equals(userName, other.userName)
				&& Objects.equals(userPwd, other.userPwd);
	}

	
	
	
	
}
