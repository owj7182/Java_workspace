package sh.java.polymorphism.animal;

public class Tiger extends Animal implements Runnable {
	
	public void punch() { 
		System.out.println("타이거 펀치를 날립니다...");
	}
	
	@Override
	public void attack() {
		punch();
	}
	
	@Override
	public void say() {
		System.out.println("타이거입니다...");
	}

	@Override
	public void run() {
		System.out.println("타이거가 달립니다...");
	}

	@Override
	public void eat(String food) {
		System.out.println("타이거가 " + food + "를 먹습니다...");
	}

}
