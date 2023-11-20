package ncs_javaTest2.com.kh.test;

public class Test {

	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
		pArr[0] = new Person("오우진");
		pArr[1] = new Person("이순신");
		pArr[2] = new Person("홍길동");
		
		
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getName());
		}
	}

}
