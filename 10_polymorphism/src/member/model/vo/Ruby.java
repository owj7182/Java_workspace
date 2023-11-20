package member.model.vo;

public class Ruby extends Member{
	public Ruby() {}

	public Ruby(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public int buy(int price) {
		return price - (int)(price * 0.3);
	}
	
	// 이자 포인트 getter
	@Override
	public double getInterestPoints() {
		return (getPoint() * 0.3);
	}

}