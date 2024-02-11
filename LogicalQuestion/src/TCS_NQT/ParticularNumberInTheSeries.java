package TCS_NQT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParticularNumberInTheSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		List<Integer>ls=new ArrayList<>();
		int a=0;
		int b=0;
		ls.add(0);
		ls.add(0);
	//	System.out.println(ls);
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				 a=a+2;
				 ls.add(a);	
			}else{
				b=b+1;
				ls.add(b);
			}
		}
		System.out.println(ls);
		System.out.println(ls.get(5));
	}
}