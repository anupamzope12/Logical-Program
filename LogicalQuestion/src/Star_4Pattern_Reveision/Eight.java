//
//package Star_4Pattern_Reveision;
//
//public class Eight {
//public static void main(String[] args) {
//
//	int n=6;
//	for(int i=0;i<n;i++) {
//		for(int j=0;j<i;j++) {
//			System.out.print(" ");
//		}
//		for(int k=2*n-i; k>i;k--) {
//			System.out.print("*");
//		}
//		System.out.println();	
//	}
//  }
//}
package Star_4Pattern_Reveision;

public class Eight {
    public static void main(String[] args) {

        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) { // Corrected loop condition
                System.out.print(" ");
            }
            for (int k = (2 * n) - i; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
