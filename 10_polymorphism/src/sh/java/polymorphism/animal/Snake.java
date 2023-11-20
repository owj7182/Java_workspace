package sh.java.polymorphism.animal;

public class Snake extends Animal {
	
	@Override
	public void attack() {
		System.out.println("뱀이 물었습니다...");
	}

	@Override
	public void eat(String food) {
		System.out.println("뱀이 " + food + "를 먹습니다...");
	}

}
