package Important;

public class PrimeNo {
public static void main(String[] args) {
	int num=281;
	System.out.println(isPrime(num));
	}
	
	public static boolean isPrime(int num) {
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;		
	}
}