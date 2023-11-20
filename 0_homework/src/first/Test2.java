package first;

public class Test2 {
	
	public static void main(String[] args) {
		
		Test2 homework2 = new Test2();
		homework2.test1();
		
	}
	 
	
	public void test1() {
		String name1 = "오우진";
		String name2 = "신현아";
		
		int age1 = 26;
		int age2 = 26;
		
		char sex1 = '남';
		char sex2 = '여';
		
		String num1 = "01050494819";
		String num2 = "01082017485";
		
		String email1 = "owj@naver.com";
		String email2 = "shin@naver.com";
		
		String adr1 = "서울시 노원구";
		String adr2 = "서울시 중랑구";
				
		System.out.println("===================================================");
		System.out.println(" 이름   " + "나이 " + "  성별 " +"전화번호      " + "  이메일    " + "         주소 ");
		System.out.println("===================================================");
		System.out.printf("%s   %d    %c  %s  %s  %s %n",name1, age1, sex1, num1, email1, adr1);
		System.out.printf("%s   %d    %c  %s  %s  %s %n",name2, age2, sex2, num2, email2, adr2);
	}

}
