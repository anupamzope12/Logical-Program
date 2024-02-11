package star_Pattern;

public class Left_Triangle_Pascal {
public static void main(String[] args) {
	int rows=5;
	for(int i=1 ; i<rows ;i++) {
		for(int j=rows-i ; j>1 ;j--) {
			System.out.print(" ");
		}
		for(int k=1 ; k<=i ; k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	int n=4;
	for(int i=1; i<n ; i++) {
		for(int l=1 ; l<=i ; l++) {
			System.out.print(" ");
		}
		for(int l=1 ; l<rows-i ;l++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
