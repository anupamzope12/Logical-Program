package ThreadByDurgesh;

public class ThreadClass extends Thread {
	
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println("ThreadClass i =" + i);
			try {
				Thread.sleep(1001);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadClass thr= new ThreadClass();
		ThreadRunnable th=new ThreadRunnable();
		Thread t= new Thread(th);
		t.start();
		thr.start();		
	}
}
