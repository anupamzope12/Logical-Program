package Numeric_Pattern_in_Java;

public class RightTriangleNumericPattern {
public static void main(String[] args) {
	int rows=5;
	for(int i=1 ; i<=rows ;i++) {
		for(int j=i ; j>=1 ;j--) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
}
}
