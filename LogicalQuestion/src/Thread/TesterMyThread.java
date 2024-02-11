package Thread;
import static java.lang.Thread.*;
public class TesterMyThread {
public static void main(String[] args) throws InterruptedException{
	System.out.println("main thread details " + Thread.currentThread());
	MyThread t1=new MyThread("one");
	MyThread t2=new MyThread("two");
	MyThread t3=new MyThread("three");
	MyThread t4=new MyThread("four");
	MyThread t5=new MyThread("five");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	for(int i=0;i<10;i++) {
		System.out.println(currentThread().currentThread().getName() + " exec # " + i );
		sleep(1000);
	}
	System.out.println("main over........");
	
}
}
