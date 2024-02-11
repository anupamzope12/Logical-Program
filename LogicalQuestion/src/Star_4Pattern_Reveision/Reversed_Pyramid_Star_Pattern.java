package Star_4Pattern_Reveision;

public class Reversed_Pyramid_Star_Pattern {
public static void main(String[] args) {
	for(int i=0 ;i<5 ;i++) {
		for(int k=0;k<i;k++) {
			System.out.print(" ");
		}
		/*
		 * for(int l=i;l<5;l++){ System.out.print("* "); }
		 */
		for(int p=i;p<5;p++) {
			System.out.print("* ");
		}
		System.out.println();
	}
  }
}