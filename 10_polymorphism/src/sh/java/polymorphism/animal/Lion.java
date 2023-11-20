package sh.java.polymorphism.animal;

public class Lion extends Animal implements Runnable {
	
	public void kick() {
		System.out.println("라이언 킥을 날립니다...");
	}
	
	@Override
	public void attack() {
		kick();
	}
	
	@Override
	public void say() {
		System.out.println("라이언입니다...");
	}
	
	@Override
	public void run() {
		System.out.println("라이언이 달립니다...");
	}
	
	@Override
	public void eat(String food) {
		System.out.println("라이언이 " + food + "를 먹습니다...");
	}

}
