package ncs.test9;

public class PlaneTest {

	public static void main(String[] args) {
		Airplane air = new Airplane();
		Cargoplane car = new Cargoplane();
		
		air = new Airplane("L747", 1000);
		car = new Cargoplane("c40", 1000);
		
		System.out.println("Plane\t" + "fuelSize");
		System.out.println("------------------");
		System.out.println(air.getPlaneName() + "\t" + air.getFuelSize());
		System.out.println(car.getPlaneName() + "\t" + car.getFuelSize());
		
		
		air.flight(100);
		car.flight(100);
		System.out.println("100운항");
		System.out.println("Plane\t" + "fuelSize");
		System.out.println("------------------");
		
		System.out.println(air.getPlaneName() + "\t" + air.getFuelSize());
		System.out.println(car.getPlaneName() + "\t" + car.getFuelSize());
		
		air.refuel(200);
		car.refuel(200);
		System.out.println("200 주유");
		System.out.println("Plane\t" + "fuelSize");
		System.out.println("------------------");
		System.out.println(air.getPlaneName() + "\t" + air.getFuelSize());
		System.out.println(car.getPlaneName() + "\t" + car.getFuelSize());
		
		
	}

}
