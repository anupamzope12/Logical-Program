package Array;

import java.util.Scanner;

public class Negative_Subarrays2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int len=sc.nextInt();
		int arr[]=new int [len];
		System.out.println("Enter the elements");
		for(int i=0 ;i<len ;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(countNegativeSubarrys(arr,len));
	
	}
	public static int countNegativeSubarrys(int arr[],int len) {
		int count=0;
		int k=0;
		int sum=0;
		for(int i=0 ;i<len ;i++) {
			if(arr[i]<0) {
			count++;
			}
		}
		
		for(int i=0 ;i<len-1 ;i++) {
			sum=arr[i];
			k=i+1;
			while(k<=len-1) {
				sum = sum+ arr[k];
				if(sum<0) {
					count++;
				}	
			}
			k++;	
		}
		return count;
	}
}