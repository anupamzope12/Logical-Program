package Important;

public class PrimeNoUpToN {
public static void main(String[] args) {
	printPrime(100);

	}
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
	return true;	
	}
	
	public static void printPrime(int num) {
		for(int i=0;i<=num;i++) {
		if(isPrime(i)) {
System.out.println(i + " ");
		}
		}
		
	}
}