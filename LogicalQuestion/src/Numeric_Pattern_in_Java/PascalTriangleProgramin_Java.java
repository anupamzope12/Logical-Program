package Numeric_Pattern_in_Java;

//package Numeric_Pattern_in_Java;
//
//public class PascalTriangleProgramin_Java {
//public static void main(String[] args) {
//	int rows=5;
////	int num;
////			if(num%2==1)
//	for(int i=0 ; i<rows ;i++) {
//		for(int j=rows-1; j>1 ; j--) {
//			System.out.print(" ");
//		}
//		for(int k=1 ; k<2*i-1 ; k++)
//		{
//			if(k==1 || k==2*i-1) {
//				System.out.print("1");
//			}
//			int num=2;
//			if(k%2==1) {
//				System.out.print("");
//			}
////			int odd;
////			odd=;
////					int p=k%2==1;
////			if(k==odd) {
////				
////				System.out.print(num);
////				
////			}
//			
//			else {
//				System.out.println(" ");
//			}
//			num++;
//			
//		}
//		System.out.println();
//	}
//	
//}
//}

public class PascalTriangleProgramin_Java	{
	public static void main(String[] args) {
        int rows = 5; // Number of rows to print
        for (int i = 0; i < rows; i++) {
            // Print spaces to align the triangle
            for (int j = 0; j < rows - i; j++) {
                System.out.print("  ");
          }
//        	for(int j=numRows-1; j>1 ; j--) {
//    			System.out.print(" ");
//    		}        	
            // Calculate and print the values in the current row
            int coef = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print("   " + coef);
                coef = coef * (i - j) / (j + 1);
            }
            System.out.println();
        }
	}
}