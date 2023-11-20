package sh.java.thread.synchronization.bakery;

public class Baker implements Runnable {
	private Plate plate;
	
	public Baker(Plate plate) {
		this.plate = plate;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			plate.makeBread(i);
			
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}	
	}
}
