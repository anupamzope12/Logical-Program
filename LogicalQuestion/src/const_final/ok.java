package const_final;

import java.util.Scanner;

public class ok {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int SPEED=80;
//	SPEED=100;
//	const int A =10;
	System.out.println("Enter the final value");
	
	final int myconst1=458;
	final int myconst=sc.nextInt();
	int a=45;
	
	double add=myconst+a;
	System.out.println("Addition " + add);
	
	}
}