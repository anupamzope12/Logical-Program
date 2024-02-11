package Thread;

public class MyThread extends Thread{
	public MyThread(String name) {
		System.out.println("Constructor invoked by " + Thread.currentThread().getName());
	}
	
	public void run() {
		System.out.println(getName() + " started");
		
		try {
			for(int i=0 ;i<10;i++) {
				System.out.println(getName() + " exec # " + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(getName() + " got exc " +e);
			// TODO: handle exception
		}
		System.out.println(getName() + " over ");
	}

}
