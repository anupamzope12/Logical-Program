package ThreadByDurgesh;

public class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0 ;i<10;i++) {
			System.out.println("value of i is " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadRunnable thr=new ThreadRunnable();
		Thread t1=new Thread(thr);
		t1.start();
	}

}
