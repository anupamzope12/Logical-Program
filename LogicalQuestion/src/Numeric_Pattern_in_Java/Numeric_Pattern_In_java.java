package Numeric_Pattern_in_Java;
public class Numeric_Pattern_In_java {
public static void main(String[] args) {
	int rows=5;
	int num=1;
	for(int i=1 ; i<rows ; i++) {
		for(int j=0 ; j<i ; j++) {
			System.out.print(num + " ");
//		num++;
	  }
		num++;
		System.out.println();
	}
  }
}
