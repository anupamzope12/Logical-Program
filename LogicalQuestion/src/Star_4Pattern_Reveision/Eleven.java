package Star_4Pattern_Reveision;

public class Eleven {
public static void main(String[] args) {
	int n=6;
	for(int i=0;i<n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int k=0 ; k<n;k++) {
		for(int l=n-k;l>0;l--) {
			System.out.print("* ");
		}
	System.out.println();
	}
    }
}
