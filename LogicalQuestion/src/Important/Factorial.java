package Important;

public class Factorial {
public static void main(String[] args) {
	int fact=1;
	int n=6;
	for(int i=0;i<n;i++) {
		fact=fact+fact*i;
	}
	
	System.out.println(fact);
	}
}