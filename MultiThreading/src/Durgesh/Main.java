package Durgesh;

public class Main {
	public static void main(String[] args) {

	ImplementsRunnable imp=new ImplementsRunnable();
	Thread myThread = new Thread(imp);
	myThread.start();
	
	ExtendingThreadClass ex=new ExtendingThreadClass();
	ex.start();

	}
}