package ncs.test9;

public abstract class Plane {
	
	private String planeName;
	private int fuelSize;
	
	public Plane() {
		super();
	}

	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		this.fuelSize += fuel;
	}
	
	public abstract void flight(int distance);
		

	String getPlaneName() {
		return planeName;
	}

	void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	int getFuelSize() {
		return fuelSize;
	}

	void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	
}
