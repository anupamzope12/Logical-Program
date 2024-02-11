package HackerRank;

import java.util.Scanner;

public class ValidUsernameRegularExpression {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the UserName");
	String username=sc.next();
	
	int len=username.length();
	if(len<9) {
		System.out.println("Invalid");
	}
	for(int i=0;i<username.length();i++) {
		if(len < 9 )
		{
			System.out.println("invalid");
		}
		char firstChar=username.charAt(0);
		if(firstChar>='A' && firstChar<='Z' || firstChar>='a' && firstChar<='z') {
			
		}
	}
  }
}
