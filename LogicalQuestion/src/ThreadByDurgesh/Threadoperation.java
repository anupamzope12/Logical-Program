package ThreadByDurgesh;

public class Threadoperation {
public static void main(String[] args) {
	System.out.println("Program Started");
	int x=65+89;
	System.out.println(x);
	
	Thread t=Thread.currentThread();
	String s=t.getName();
	t.setName("Anupam");
	System.out.println();
	System.out.println("Name of the current thread is " +t);
	System.out.println(t.getId());
	try {
		Thread.sleep(1000);
	}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	UserThread us=new UserThread();
	us.start();
	System.out.println("Program Ended");
  }
}