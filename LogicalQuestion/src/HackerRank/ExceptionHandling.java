package HackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the value of x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		try {
			int ans=x/y;	
			System.out.println(ans);
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			if(y==0) {
				System.out.println("java.lang.ArithmeticException: / by zero45");
			}
		}
		catch(InputMismatchException e) {
            System.out.println(new InputMismatchException());
        }	
	}
}