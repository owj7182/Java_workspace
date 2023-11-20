package sh.java.oop.field;

/**
 * 
 * <pre>
 * 1,홍길동,KH정보교육원,공공데이터자바개발자과정,352,남,50
 * 2,신사임당,KH정보교육원,공공데이터자바개발자과정,352,여,80
 * 3,이순신,KH정보교육원,공공데이터자바개발자과정,352,남,70
 * 
 * 2023-09-21
 *
 */
public class KHStudentMain {

	public static void main(String[] args) {
		KHStudent hong = new KHStudent();
		hong.setId(1L);
		hong.setName("홍길동");
		hong.setGender('남');
		hong.setScore(50);
		hong.printInfo();
		
		KHStudent sin = new KHStudent();
		sin.setId(2L);
		sin.setName("신사임당");
		sin.setGender('여');
		sin.setScore(80);
		sin.printInfo();
		
		KHStudent lee = new KHStudent();
		lee.setId(3L);
		lee.setName("이순신");
		lee.setGender('남');
		lee.setScore(70);
		lee.printInfo();

	}

}
