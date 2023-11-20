package mobile;

public abstract class Mobile {
	private String MobileName;
	private int batterySize;
	private String osType;
	
	public Mobile() {
		super();
	}

	public Mobile(String mobileName, int batterySize, String osType) {
		super();
		MobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	public abstract int operate(int time);
	
	public abstract int charge(int time);

	String getMobileName() {
		return MobileName;
	}

	void setMobileName(String mobileName) {
		MobileName = mobileName;
	}

	int getBatterySize() {
		return batterySize;
	}

	void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	String getOsType() {
		return osType;
	}

	void setOsType(String osType) {
		this.osType = osType;
	}
	
	
}
