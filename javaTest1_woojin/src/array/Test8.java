package array;

public class Test8 {
	
	public static void main(String[] args) {
		Test8 t = new Test8();
		t.test8();
		
	}
	
	public void test8() {
		int [][] array = {
				{12, 41, 36, 56}, 
				{82, 10, 12, 61}, 
				{14, 16, 18, 78}, 
				{45, 26, 72, 23}
				};
		// 합계, 평균 변수 선언
		int sum = 0;
		double avg1 = 0;
		double avg2 = 0;
		
		// 2차원 배열을 순회하면서 누적합 구하기 / 개수 세기
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				avg1 = (double)sum / array.length;
			}
			avg2 = avg1 / array.length; 
		}
		//결과 출력
		System.out.println("합계 : " + (double)sum);
		System.out.println("평균 : " + (double)avg2);
	}

}
