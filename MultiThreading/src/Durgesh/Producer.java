package Durgesh;

public class Producer extends Thread{
	Company c;
	
	Producer(Company c) {
		this.c=c;
	}
	
	public void run() {
		int i=1;
		while(true) {
			this.c.produce_Item(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}
