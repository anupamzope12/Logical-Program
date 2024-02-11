package Thread;

public class ImplementsRunnable implements Runnable {
	
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId()+" is running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		int n=8;
		for(int i=0 ;i<n ;i++) {
			Thread object=new Thread(new ImplementsRunnable());
			object.start();
		}
	}

}
