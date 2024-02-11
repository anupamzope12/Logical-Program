package Numeric_Pattern_in_Java;
public class Number_Pattern_In_Java2 {
	public static void main(String[] args) {
		int rows=5;
		int num=1;
		for(int i=1 ; i<rows ; i++) {
			for(int j=0 ; j<i ; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
