package String;

import java.util.Scanner;

public class Stringsubstring {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String str= "HelloWorld";
	System.out.println("Enter the start and end index");
	int start=sc.nextInt();
	int end  =sc.nextInt();
	
	System.out.println(str.substring(start, end));

	}
}
