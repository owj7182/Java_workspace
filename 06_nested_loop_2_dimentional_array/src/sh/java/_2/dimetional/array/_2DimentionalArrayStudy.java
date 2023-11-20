package sh.java._2.dimetional.array;

/**
 * <pre>
 * 2차원배열
 * - 행을 의미하는 인덱스
 * - 열을 의미하는 인덱스
 * 
 * 
 * 2023-09-18
 *
 */
public class _2DimentionalArrayStudy {

	public static void main(String[] args) {
		_2DimentionalArrayStudy study = new _2DimentionalArrayStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
//		study.test6();
//		study.test7();
		study.test8();
		
//		study.test9();
//		study.test10();
	}
	
	/**
	 * 2차원배열 foreach문
	 */
	public void test10() {
		int[][] arr = new int[][] {
			{1, 2, 3},
			{4, 5, 6}
		};
		
		for(int[] _arr : arr) {
			for(int n : _arr) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 가변배열
	 * - 2차원배열은 1차원배열 여러개 묶어 관리하는 것.
	 * - 1차원배열의 크기가 모두 같은 필요는 없다.
	 */
	public void test9() {
		int[][] arr = new int[2][];
		
		arr[0] = new int[3];
		arr[1] = new int[2];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * <pre>
	 * 학생별 평균구하기
	 * - 홍길동 90, 70, 55
	 * - 신사임당 100, 95, 100
	 * - 이순신 80, 75, 90
	 * - 유관순 55, 90, 80
	 * 
	 * @최종출력
	 * 
	 * 	90 70 55 평균
	 *  100 95 100 평균
	 *  80 75 90 평균
	 *  55 90 80 평균 
	 */
	public void test8() {
		double[][] scores = new double[4][4];
		
		// 값대입(점수)
		// 홍길동
        scores[0][0] = 90;
        scores[0][1] = 70;
        scores[0][2] = 55;
        // 신사임당
        scores[1][0] = 100;
        scores[1][1] = 95;
        scores[1][2] = 100;
        // 이순신
        scores[2][0] = 80;
        scores[2][1] = 75;
        scores[2][2] = 90;
        // 유관순
        scores[3][0] = 55;
        scores[3][1] = 90;
        scores[3][2] = 80;
		
		// 반복문(평균계산 - 3번지 값대입)
		for(int i = 0; i < scores.length; i++) {
			int sum = 0; // 매 행마다 초기화
			for(int j = 0; j < scores[i].length; j++) {
				// 0 ~ 2번지 점수누적
				if(j != scores[i].length - 1) {
					sum += scores[i][j];
				}
				// 3번지 총점/평균 계산
				else {
					scores[i][j] = sum / 3.0;
				}
			}
		}
		
		// 결과출력
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	/**
	 * 3차원 배열
	 * - String[][][] 
	 * - 1차원 0 / 1 분단
	 * - 2차원 0 1 2 3 4 행
	 * - 3차원 0 1 2 열
	 * 
	 */
	public void test7() {
		String[][][] classmates = new String[2][5][3];
		classmates[0][0][0] = "배성은";
        classmates[0][0][1] = "고혜진";
        classmates[0][1][0] = "천무진";
        classmates[0][1][1] = "한준희";
        classmates[0][1][2] = "오승현";
        classmates[0][2][0] = "유정호";
        classmates[0][2][1] = "차유신";
        classmates[0][3][1] = "권나영";
        classmates[0][3][2] = "성민준";
        classmates[0][4][0] = "한승훈";
        classmates[0][4][1] = "김영준";
        
        classmates[1][0][1] = "정승범";
        classmates[1][0][2] = "정진우";
        classmates[1][1][0] = "이재준";
        classmates[1][1][1] = "오우진";
        classmates[1][2][1] = "이민정";
        classmates[1][2][2] = "권현주";
        classmates[1][3][0] = "한보경";
        classmates[1][3][1] = "정용준";
        classmates[1][3][2] = "임초임";
        classmates[1][4][0] = "김정효";
        classmates[1][4][1] = "박종철";
        
        for(int i = 0; i < classmates.length; i++) {
        	System.out.println("===== " + (i == 0 ? "왼쪽" : "오른쪽") + "분단 =====");
        	for(int j = 0; j < classmates[i].length; j++) {
        		
        		for(int k = 0; k < classmates[i][j].length; k++) {
        			if(classmates[i][j][k] == null)
        				classmates[i][j][k] = "     ";
        			System.out.print(classmates[i][j][k] + " ");
        		}
        		System.out.println();
        		
        	}
        	System.out.println();
        }
        
	}
	
	/**
	 * 우리반 자리배치 배열표현
	 * - 
	 */
	public void test6() {
		String[][] classmates = new String[5][3];
        classmates[0][1] = "정승범";
        classmates[0][2] = "정진우";
        classmates[1][0] = "이재준";
        classmates[1][1] = "오우진";
        classmates[2][1] = "이민정";
        classmates[2][2] = "권현주";
        classmates[3][0] = "한보경";
        classmates[3][1] = "정용준";
        classmates[3][2] = "임초임";
        classmates[4][0] = "김정효";
        classmates[4][1] = "박종철";
        
        for (int i = 0; i < classmates.length; i++) {
            for(int j = 0; j < classmates[i].length; j++) {
            	if(classmates[i][j] == null)
            		classmates[i][j] = "_____";
                System.out.print(classmates[i][j] + " ");
            }
            System.out.println();
        }
	}
	
	/**
	 * 2차원 배열의 구조
	 */
	public void test5() {
		int[][] arr = new int[][] {
			{1, 2, 3},
			{4, 5, 6}
		};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 알파벳 대입
	 * - char[][] 
	 * - 0행 대문자 65 66 67 ...
	 * - 1행 소문자 97 98 99 ...
	 * 
	 * 
	 */
	public void test4() { 
		// 변수선언
		char[][] alphabets = new char[2][26];
		
		// 값대입
		char upper = 'A';
		char lower = 'a';
		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++) {
				if(i == 0)
					alphabets[i][j] = upper++;
				else 
					alphabets[i][j] = lower++;
			}
		}
		
		// 값출력
		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++) {
				System.out.print(alphabets[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	/**
	 * 2차원배열 값대입	
	 * - 배열요소가 규칙적으로 증가/감소할때 2차원반복문을 통해 값대입 가능
	 */
	public void test3() {
		int[][] arr = new int[2][10];
		
		// 값대입
		int k = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
			}
		}
		
		// 값출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 초기화
	 * - 배열변수선언 + 배열객체 할당 + 번지수별 값할당
	 */
	public void test2() {
		int[][] arr = new int[][]{
			{1, 2, 3},
			{4, 5, 6}
		};
		
		int[][] arr2 = {
			{10, 20, 30},
			{40, 50, 60},
			{70, 80, 90}, // 마지막 컴마 작성가능
		}; 
		
		// 중첩반복문 사용해 값출력하기 (행/열 형태 그대로)
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	/**
	  * 1. 배열변수 선언
	  * 2. 배열객체 할당
	  * 3. 번지수별 값할당
	 */
	public void test1() {
		// 배열변수 선언
		int[][] arr;
		
		// 배열객체 할당
		arr = new int[2][3]; // 2행 3열
		
		// 기본값 확인
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
		// 값대입
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
		// 반복문처리
		// 행의 수 arr.length
		// 열의 수 arr[i].length
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(i + ", " + j + " -> " + arr[i][j]);
			}
		}
		
	}
}
