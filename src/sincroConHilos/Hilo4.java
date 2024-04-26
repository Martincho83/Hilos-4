package sincroConHilos;

public class Hilo4 extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("K");
			try {
				Hilo4.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
