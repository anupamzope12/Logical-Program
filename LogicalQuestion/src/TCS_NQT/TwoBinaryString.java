package TCS_NQT;

import java.util.Scanner;

public class TwoBinaryString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Give two binary numbers");
		
		String one=sc.next();
//		char onech=toCharArray(one);
		char onech[]=one.toCharArray();
		String two=sc.next();
		char twoch[]=two.toCharArray();

		int count1=0;
		int count0=0;

		for(int i=0;i<onech.length;i++) {
			if(onech[i]=='0') {
				count0++;
			}
			if(onech[i]=='1') {
				count1++;
			}

		}
		int countone=0;
		int countzero=0;
		for(int i=0;i<twoch.length;i++) {
			if(twoch[i]=='0') {
				countzero++;
			}
			if(twoch[i]=='1') {
				countone++;
			}

		}
		if((count1==countone)&& (count0==countzero)) {
			System.out.println("YES");
		}
	
	
	
	}
}