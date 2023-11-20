package sh.java.object.array.student;

/**
 * <pre>
 * VO
 *  
 * 2023-09-25
 * 
 */
public class Student {
	private long id;
	private String name;
	private char gender;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long id, String name, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
}
