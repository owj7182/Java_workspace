package sh.java.object.array.person;

/**
 * <pre>
 * 데이터를 담는 용도의 클래스
 * - VO value object 
 * - DO domain object
 * - DTO data transfer object
 * - BEAN 
 * - Entity (db관점)
 * 
 * 
 * 2023-09-25
 * 
 */
public class Person {
	private String name;
	private int age;
	
	public Person() {}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 원래 toString
	 * type@hashCode -> 필드값 문자열
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
