package Durgesh;

public class Company {
	int n;
	boolean f=false;
	//f=false : chance :producer
	//f=true : chance :consumer
	synchronized void produce_Item(int n) {
		if(f) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("produced : "+ this.n);
		f=true;
		notify();
	}
	synchronized public int consume_Item() {
		if(!f) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Consumed : "+ this.n);
		f=false;
		notify();
		return this.n;
	}
}
