package sh.java.polymorphism.animal;

public class Eagle extends Animal implements Flyable {

	@Override
	public void say() {
		System.out.println("저는 이글이글입니다...");
	}
	
	@Override
	public void eat(String food) {
		System.out.println("이글이 " + food + "를 먹습니다...");
	}

	@Override
	public void attack() {
		System.out.println("이글이 발톱으로 낚아챘습니다.");
	}

	@Override
	public void fly() {
		System.out.println("이글이 날고 있습니다...");
	}

}
