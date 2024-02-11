package Other;

import java.util.Scanner;

public class Swapping {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		 
		System.out.println("Before swap the value of x and y" +"X : " + x +  "Y : " + y );
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 System.out.println("After swap the value of x and y" +"X : " + x +  "Y : " + y );
	}

}
