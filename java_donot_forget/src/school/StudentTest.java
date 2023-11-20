package school;

public class StudentTest {

	public static void main(String[] args) {
		
		Student[] studentArray = new Student[3];
		// Student 객체를 3개 생성하여 배열에 넣는다.
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임꺽정", 16, 175, 65);
		
		double avgAge = 0;
		double avgHeight = 0;
		double avgWeight = 0;
		
		System.out.println("이름 " + "나이 " + "신장 " + "몸무게 ");
		
		// 배열에 있는 객체 정보를 모두 출력한다 - for 문을 이용 할 것
		for (int i = 0; i < studentArray.length; i++) {
			System.out.print(studentArray[i].getName() + " ");
			System.out.print(studentArray[i].getAge() + " ");
			System.out.print(studentArray[i].getHeight() + " ");
			System.out.println(studentArray[i].getWeight() + " ");
			
			avgAge += studentArray[i].getAge();
			avgHeight += studentArray[i].getHeight();
			avgWeight += studentArray[i].getWeight();
			
		}	
		System.out.println();
		// 나이의 평균 출력
		System.out.println("나이의 평균 : " + Math.round(avgAge/3 * 100) / 100.0);
		// 신장의 평균 출력
		System.out.println("신장의 평균 : " + Math.round(avgHeight/3 * 100) / 100.0);	
		// 몸무게의 평균 출력
		System.out.println("몸무게의 평균 : " + Math.round(avgWeight/3 * 100) / 100.0);
	}

}
