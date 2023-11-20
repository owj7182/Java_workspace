package sh.java.thread.synchronization.bakery;

public class BakeryMain {

	public static void main(String[] args) {
		
			Plate plate = new Plate();
			
			Thread th1 = new Thread(new Baker(plate), "Baker");
			Thread th2 = new Thread(new Consumer(plate), "Consumer");
			
			th1.start();
			th2.start();
	}

}
