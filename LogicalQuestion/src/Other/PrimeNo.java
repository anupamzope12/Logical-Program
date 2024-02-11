package Other;

public class PrimeNo {
public static void main(String[] args) {
	int b;
	int n=23;
	int count=0;
	for(int i=0;i<n;i++) {
		b=i%2;
		if(b==1) {
			System.out.println(i);
			count++;
		}
	}
	
	System.out.println();
	System.out.println(" Count "  + count);
  }
}