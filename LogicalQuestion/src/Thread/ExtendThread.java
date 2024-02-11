package Thread;

public class ExtendThread extends Thread {
	public void run(){
		try {
			System.out.println("Thread" + Thread.currentThread().getId() + " is runnig");
		} catch (Exception e) {
			System.out.println("Exception is caught");
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		int n=8;
		for(int i=0 ;i<n ;i++) {
		ExtendThread ex=new ExtendThread();
		ex.start();
		}
	}
}
