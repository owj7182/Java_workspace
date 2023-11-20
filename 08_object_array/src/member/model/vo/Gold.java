package member.model.vo;

public class Gold extends Member{
	
	public Gold() {}

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
		
	}

	public double getInterestPoints() {
		return super.getPoint() * 0.05;
	}
	
	

}
