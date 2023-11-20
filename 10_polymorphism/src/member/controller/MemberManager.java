package member.controller;

import member.model.vo.Member;

/**
 * control 클래스
 *
 */
public class MemberManager {
	// 회원을 최대 40명 저장할 수 있는 Member타입 객체배열 선언
	private Member[] members = new Member[40];
	// 저장된 회원수를 관리할 인덱스 변수 선언
	private int mCount = 0;

	
	public void insertMember(Member m) {
		members[mCount++] = m;
	}
	
	public void printData() {
		System.out.println("---------------<< 회원정보 >>---------------");
		System.out.println("이름        등급        포인트      이자포인트");

		for (int i = 0; i < mCount; i++) {
			System.out.printf("%-9s %-9s %-9d %-9.2f\n", 
					members[i].getName(), members[i].getGrade(),
					members[i].getPoint(), members[i].getInterestPoints());
		}
		System.out.println("-----------------------------------------");
	}
	
	public void printBuyInfo(int price) {
		for(int i = 0 ; i < mCount ; i++) {
			System.out.printf("%s등급회원 %s는 %d원 상품을 %d원에 구매합니다.\n",
					members[i].getGrade(),
					members[i].getName(),
					price, 
					members[i].buy(price)
					);
		}
		System.out.println("-----------------------------------------");
	}

}