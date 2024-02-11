package Star_4Pattern_Reveision;

public class Seven {
public static void main(String[] args) {

	int n=6;
	for(int i=0;i<n;i++) {
		for(int j=0;j<i;j++) {
			System.out.print(" ");
		}
		for(int k=n; k>i;k--) {
			System.out.print("* ");
		}
		System.out.println();	
	}
  }
}