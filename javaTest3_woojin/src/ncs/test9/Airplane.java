package ncs.test9;

public class Airplane extends Plane{

	public Airplane() {
		super();
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight(int distance) {
		setFuelSize(getFuelSize() - (distance/10) * 30);
	}

	
}
