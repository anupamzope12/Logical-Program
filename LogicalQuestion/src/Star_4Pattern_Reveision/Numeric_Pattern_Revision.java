package Star_4Pattern_Reveision;

public class Numeric_Pattern_Revision {
public static void main(String[] args) {
	int rows=5;
	int num=1;
//	for(int i=0 ;i<rows ;i++) {
	for(int i=1 ;i<=rows;i++) {
//		int num=1;
//		for(int k=0;k<i;k++) {
//			System.out.print(num + " ");
//			 num++;
//		}
		for(int j=i;j>=1;j--)
		{
			System.out.print(j +" ");
		}
//		num++;

		System.out.println();
	}
}
}
