package member.model.vo;

public class Gold extends Member{
	
	public Gold() {}

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
		
	}
	
	public int buy(int price) {
		return price - (int)(price * 0.05);
	}
	
	public double getInterestPoints() {
		return (getPoint() * 0.05);
	}
	
	

}