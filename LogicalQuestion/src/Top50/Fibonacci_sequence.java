package Top50;

public class Fibonacci_sequence {
	public static void main(String[] args) {
		series(10);
	}
	public static void series(int out) {
		int a=0;
		int b=1;
		int c=1;
		for(int i=1 ; i<=out ; i++)
		{
			System.out.print(a + " , ");
			a=b;
			b=c;
			c=a + b;
		}
	
	}
}
//public class Fibonacci_sequence {
//
//	public static void printFibonacciSequence(int count) {
//		int a = 0;
//		int b = 1;
//		int c = 1;
//
//		for (int i = 1; i <= count; i++) {
//			System.out.print(a + ", ");
//
//            a = b;
//			b = c;
//			c = a + b;
//		}
//	}
//
//	public static void main(String[] args) {
//    	printFibonacciSequence(10);
//	}
//
//}