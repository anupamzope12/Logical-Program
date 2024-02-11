package TCS_NQT;

import java.util.Scanner;

public class starHash {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.next();
	int count1=0;
	int count2=0;
	char ch[]=str.toCharArray();
	for(int i=0 ;i<ch.length;i++) {
		if(ch[i]=='*') {
			count1++;
		}
		if(ch[i]=='#')
		{
			count2++;
		}
	}
	int abs=Math.abs(count2-count1);
	System.out.println(abs);
}
}
