package sh.java.oop.field;

/**
 * 
 * <pre>
 * 변수의 종류
 * 1. 전역변수(클래스 영역) global variable
 * 	- static 변수(필드) / 클래스변수(객체간의 공유)
 *  - non-static 변수(필드) / 멤버변수(객체에 소속, 객체마다 다른 정보)
 * 2. 지역변수(메소드 영역) local variable
 * 
 * 변수의 생명주기
 * 1. static변수 : 프로그램상에서 클래스를 처음 사용했을때 ~ 프로그램 종료시
 * 2. non-static변수 : 객체생성시 ~ 객체제거(gc)
 * 3. 지역변수 : 메소드호출시 ~ 메소드종료
 * 
 * 
 * 2023-09-21
 *
 */
public class XiaomiPhone {
	public static final double[] size = {5, 20, .5};
	public static final int weight = 200; // 객체간의 공유할 정보
	
	private String owner;
	private String number;
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getOwner() {
		return this.owner;
	}
	public String getNumber() {
		return this.number;
	}
}
