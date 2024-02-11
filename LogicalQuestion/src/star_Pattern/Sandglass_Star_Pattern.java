package star_Pattern;

public class Sandglass_Star_Pattern {
public static void main(String[] args) {
	int rows=5;
	for(int i=0;i<rows;i++) {
		for(int j=0 ;j<i ; j++) {
			System.out.print(" ");
		}
		for(int k=rows-i ; k>1 ; k--) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for(int i=1; i<rows ; i++)
	{
		for(int j=rows-i ; j>1 ; j--) {
			System.out.print(" ");}
		for(int k=1 ;k<=i ;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
