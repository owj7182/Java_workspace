package member.model.vo;

public class Vip extends Member{

	public Vip() {}

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	public int buy(int price) {
		return price - (int)(price * 0.1);
	}
	
	public double getInterestPoints() {
		return (getPoint() * 0.1);
	}

}