package Durgesh;

public class ThreadOperation1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Started		");
		int x=65+56;
		System.out.println("sum is " + x);
		Thread t=Thread.currentThread();
		System.out.println("current Thread Name	" + t.getName()		);

		t.setName("my main");
		System.out.println("current Thread Name	" + t.getName()		);
		t.sleep(1000);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Program Ended.......");

	}

}
