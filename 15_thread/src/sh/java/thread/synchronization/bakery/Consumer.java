package sh.java.thread.synchronization.bakery;

public class Consumer implements Runnable{
	private Plate plate;
	
	public Consumer(Plate plate) {
		this.plate = plate;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			plate.eatBread();
			
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
