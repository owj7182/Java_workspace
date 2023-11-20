package array;

public class Test9 {
	
	public static void main (String[] args) {
		Test9 t = new Test9();
		t.test9();
	}
	public void test9() {
		int [][] array = {
				{12, 41, 36, 56}, 
				{82, 10, 12, 61}, 
				{14, 16, 18, 78}, 
				{45, 26, 72, 23}
				};
		
		//최대/최소값 변수 선언
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		// 2차원 배열 순회
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				if(max < array[i][j])
					max = array[i][j];
				if(min > array[i][j])
					min = array[i][j];
			}
		}
		
		// 결과 출력
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		
		
	}

}
