package Other;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the fact number ");
		int a=sc.nextInt();
		int fact = 1;
		for(int i=1 ; i<a ; i++) {
			fact +=fact*i;
			System.out.println("fact" + fact);
		}
		System.out.println("Factorial of number " + a + " is " + fact);
	}
}
