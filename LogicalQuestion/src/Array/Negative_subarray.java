package Array;

import java.util.Scanner;

public class Negative_subarray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]= {1,-5,2,-3,4};
	int count=0;
	for(int i=0 ;i<arr.length-1;i++) {
		int sum=arr[i]+arr[i+1];
		if((sum)<0) {
			
			count++;
			System.out.println(arr[i] +" & "+ arr[i+1] + " : " + sum + "count" + count);
			
			
			
		}
	}
	System.out.println(count);
}
}
