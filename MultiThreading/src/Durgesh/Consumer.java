package Durgesh;

public class Consumer extends Thread {
	Company c;
	public Consumer(Company c) {
		this.c=c;
	}
	public void run() {
		while(true) {
			this.c.consume_Item();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
