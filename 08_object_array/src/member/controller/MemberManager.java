package member.controller;

import member.model.vo.Silver;
import member.model.vo.Gold;
import member.model.vo.Vip;
import member.model.vo.Vvip;

public class MemberManager {
	
	// Silver
	public static final int MAX_SILVER = 10;
	private Silver[] silvers = new Silver[MAX_SILVER];
	private int silverIndex = 0;
	
	// Gold
	public static final int MAX_GOLD = 10;
	private Gold[] golds = new Gold[MAX_GOLD];
	private int goldIndex = 0;
	
	// vip
	public static final int MAX_VIP = 10;
	private Vip[] vips = new Vip[MAX_VIP];
	private int vipIndex = 0;
	
	// vvip
	public static final int MAX_VVIP = 10;
	private Vvip[] vvips = new Vvip[MAX_VVIP];
	private int vvipIndex = 0;
	
	// Silver Insert
	public void silverInsert(Silver silvers) {
		this.silvers[silverIndex++] = silvers;
			
	}
	
	// Gold Insert
	public void goldInsert(Gold golds) {
		this.golds[goldIndex++] = golds;
	}
	
	// Vip Insert
	public void vipInsert(Vip vips) {
		this.vips[vipIndex++] = vips;
	}
	// Vvip Insert
	public void vvipInsert(Vvip vvips) {
		this.vvips[vvipIndex++] = vvips;
	}
	
	// printdata
	public void printData() {
		
		for (int i = 0; i < silverIndex; i++) {
			System.out.print(silvers[i].getName() + "   ");
			System.out.print(silvers[i].getGrade() + "   ");
			System.out.print(silvers[i].getPoint() + "   ");
			System.out.println(silvers[i].getInterestPoints() + "   ");
		}
		
		for (int i = 0; i < goldIndex; i++) {
			System.out.print(golds[i].getName() + "   ");
			System.out.print(golds[i].getGrade() + "   ");
			System.out.print(golds[i].getPoint() + "   ");
			System.out.println(golds[i].getInterestPoints() + "   ");
		}
		
		for (int i = 0; i < vipIndex; i++) {
			System.out.print(vips[i].getName() + "  ");
			System.out.print(vips[i].getGrade() + "  ");
			System.out.print(vips[i].getPoint() + "  ");
			System.out.println(vips[i].getInterestPoints() + "  ");
		}
		
		for (int i = 0; i < vvipIndex; i++) {
			System.out.print(vvips[i].getName() + "  ");
			System.out.print(vvips[i].getGrade() + "  ");
			System.out.print(vvips[i].getPoint() + "  ");
			System.out.println(vvips[i].getInterestPoints() + "  ");
		}
	}
	
	
	

}
