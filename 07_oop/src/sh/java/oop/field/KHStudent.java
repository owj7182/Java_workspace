package sh.java.oop.field;

/**
 * 1,홍길동,KH정보교육원,공공데이터자바개발자과정,352,남,50
 * 2,신사임당,KH정보교육원,공공데이터자바개발자과정,352,여,80
 * 3,이순신,KH정보교육원,공공데이터자바개발자과정,352,남,70
 * 
 */
public class KHStudent {
	
	public static final String ACADEMY_NAME = "KH정보교육원";
	public static final String COURSE_NAME = "공공데이터 자바개발자 과정";
	public static final int CLASSROOM = 352;
	
	private long id;
	private String name;
	private char gender;
	private int score;
	
	public void setId(long id) {
		this.id = id;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public long getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public char getGender() {
		return this.gender;
	}
	public int getScore() {
		return this.score;
	}
	public void printInfo() {
		System.out.printf("%d, %s, %s, %s, %d, %c, %d\n",
						  id, 
						  name, 
						  KHStudent.ACADEMY_NAME, 
						  COURSE_NAME, 
						  CLASSROOM, 
						  gender, 
						  score);
	}
	
	
}
