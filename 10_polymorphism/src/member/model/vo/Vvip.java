package member.model.vo;

public class Vvip extends Member{
	
	public Vvip() {}

	public Vvip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	public int buy(int price) {
		return price - (int)(price * 0.15);
	}
	
	public double getInterestPoints() {
		return (getPoint() * 0.15);
	}

}