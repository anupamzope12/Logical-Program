package Star_4Pattern_Reveision;

public class Nine {
public static void main(String[] args) {
	int n=6;
	for(int i=1;i<=n;i++) {
		for(int j=n-i;j>0;j--) {
			System.out.print(" ");
		}
		for(int k=0;k<i;k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int l=1;l<n;l++) {
		for(int m=0;m<l;m++) {
			System.out.print(" ");
		}
		for(int p=n-l; p>0 ;p-- ) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
