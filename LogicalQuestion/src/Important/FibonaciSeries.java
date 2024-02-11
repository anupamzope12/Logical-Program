package Important;

public class FibonaciSeries {
public static void main(String[] args) {
	System.out.println();
	series(12);
}

public static void series(int out) {
	int a=0;
	int b=1;
	int c=1;
	for(int i=0;i<out;i++) {
		System.out.print(a );

		if(i<out-1) {
			System.out.print( " , ");;
			
		}
		
		a=b;
		b=c;
		c=a+b;
	}
  }
}