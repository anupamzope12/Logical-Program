package String;

import java.util.Scanner;

public class IntToString {
public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer");
		int n = sc.nextInt();
		String s=Integer.toString(n);
		System.out.println("------------");
		System.out.println(s);
		
		if(!(s instanceof String)) {
			System.out.println("Request incorrect");
		}else {
			System.out.println("Good job");
		}
		
	} catch (Exception e) {
		System.out.println("Request incorrect");
		// TODO: handle exception
	}
  }
}