package member.run;


import member.model.vo.Silver;
import member.model.vo.Gold;
import member.controller.MemberManager;

import member.model.vo.Vip;
import member.model.vo.Vvip;



public class Run {

	public static void main(String[] args) {
		
		MemberManager m = new MemberManager();
		
		String member = "-----------------<<회원정보>>-----------------\n"
				+ "이름\t 등급\t 포인트\t 이자포인트\t\n"
				+ "------------------------------------------\n";
		
		System.out.println(member);
		
		m.silverInsert(new Silver("홍길동", "Silver",1000));
		m.silverInsert(new Silver("김말똥", "Silver",2000));
		m.silverInsert(new Silver("고길동", "Silver",3000));
		m.goldInsert(new Gold("김회장", "Gold",1000));
		m.goldInsert(new Gold("이회장", "Gold",2000));
		m.goldInsert(new Gold("오회장", "Gold",3000));
		
	
		m.vipInsert(new Vip("이부자", "Vip",10000));
		m.vvipInsert(new Vvip("김갑부","Vvip",100000));
		m.printData();
		

	}

}
