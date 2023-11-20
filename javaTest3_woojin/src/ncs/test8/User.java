package ncs.test8;

import java.util.Objects;

public class User implements Cloneable {
	
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	public User() {
		super();
	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return id + " " + password + " " + name + " " + age + " " + gender + " " + phone ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && gender == other.gender && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone);
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (User)obj;
		
	}

	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	char getGender() {
		return gender;
	}

	void setGender(char gender) {
		this.gender = gender;
	}

	String getPhone() {
		return phone;
	}

	void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
