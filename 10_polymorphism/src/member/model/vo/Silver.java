package member.model.vo;

public class Silver extends Member{
	
	// 기본 생성자
	public Silver() {}

	// field
	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	public int buy(int price) {
		return price - (int)(price * 0.02);
	}
	
	
	public double getInterestPoints() {
		return (getPoint() * 0.02);
	}

}