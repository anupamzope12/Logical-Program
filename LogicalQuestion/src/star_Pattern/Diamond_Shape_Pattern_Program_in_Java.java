package star_Pattern;

public class Diamond_Shape_Pattern_Program_in_Java {
	public static void main(String[] args) {
//		int rows=5;
//		for(int i=0 ; i<rows ; i++) {
//			for(int j=rows-i ; j>1 ; j--) {
//				System.out.print(" ");
//			}
//			
//			for(int k=1 ; k<=2*i-1 ; k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		
		int n=5;
		for(int l=1; l<n ; l++)
		{
			for(int m=0 ; m<l ; m++) {
				System.out.print(" ");
			}
			for(int o=1 ; o<2*l-1 ; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}