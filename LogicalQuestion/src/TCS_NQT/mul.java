package TCS_NQT;

import java.util.Scanner;

public class mul {
public static void main(String[] args) {
	int n=2554;
	int product=1;
//	int tempnumber=n;
//	while(tempnumber>0)
//	{
//		int digit=tempnumber%10;
//		product *=digit;
//		tempnumber=tempnumber/10;
//	}
//	System.out.println(product);
	String intstring=Integer.toString(n);
//	int product=1;
	for(int i=0 ;i<intstring.length();i++) {
		product *=Character.getNumericValue(intstring.charAt(i));
//		System.out.println(product);

	}
	char ch='B';
	int a=Character.getNumericValue(ch);
	System.out.println("value of b " + a);
	System.out.println(product);
	
	        char charValue = '7'; // Replace '7' with your character
	        
	        int intValue = (int) charValue + '0' ;
	        
	        System.out.println("Integer value: " + intValue);
	}
}