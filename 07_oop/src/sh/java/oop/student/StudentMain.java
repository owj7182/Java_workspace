package sh.java.oop.student;

public class StudentMain {

	public static void main(String[] args) {
		// 학생객체 
		Student student1 = new Student(); // heap영역에 Student객체 하나 만들어짐

//		System.out.println(student1.name);
//		System.out.println(student1.gender);
//		System.out.println(student1.score);
		
		System.out.println(student1.getName());
		System.out.println(student1.getGender());
		System.out.println(student1.getScore());
		System.out.println(student1.isValid());
		
		
//		student1.name = "김철수";
//		student1.gender = '남';
//		student1.score = 90;
		
		student1.setName("김철수");
		student1.setGender('남');
		student1.setScore(90);
		student1.setValid(true);
		
//		System.out.println(student1.name);
//		System.out.println(student1.gender);
//		System.out.println(student1.score);
		
		System.out.println(student1.getName());
		System.out.println(student1.getGender());
		System.out.println(student1.getScore());
		System.out.println(student1.isValid());
		
		System.out.println(student1); // 콘솔출력(문자열) - toString()
		// sh.java.oop.student.Student@24d46ca6
		
		student1.printStudentInfo();
		
		Student student2 = new Student();
		
//		student2.name = "김영희";
//		student2.gender = '여';
//		student2.score = 95;
		student2.setName("김영희");
		student2.setGender('여');
		student2.setScore(95);
		student2.setValid(true);
		
//		System.out.println(student2.name);
//		System.out.println(student2.gender);
//		System.out.println(student2.score);
//		System.out.println(student2);
		System.out.println(student2.getName());
		System.out.println(student2.getGender());
		System.out.println(student2.getScore());
		System.out.println(student2.isValid());
		
		student2.printStudentInfo();
	}
}
