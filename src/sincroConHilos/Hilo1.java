package sincroConHilos;

public class Hilo1  extends Thread{
	
	@Override
	public void run() {
		for(int i = 0;i < 10; i++) {
			System.out.print("G");
			try {
				Hilo1.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}