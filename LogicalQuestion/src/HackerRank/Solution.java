package HackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	        	System.out.println("Enter the value of x and y");
	            int x = sc.nextInt();
	            int y = sc.nextInt();
	            
	            int res = x / y;
	            System.out.println(res);
	        }
	        catch(InputMismatchException e) {
	            System.out.println(e);
	        }
	        catch(ArithmeticException e) {
	            System.out.println(e);
	        }
	}
}
