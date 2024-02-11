package Array;

import java.util.Scanner;

public class PushZerosToBackOfArray {
	public static void main(String[] args) {
		
		int arr[]={45,89,0,54,0,63,0,0,12};
		System.out.println("Arrays before pushing");
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int n = arr.length;
		PushZerosToBackOfArray(arr,n);
			
		System.out.println("Arrays after pushing");
		for(int i=0 ; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Increasing order of array");
		for(int i=n-1 ; i>=0 ;i--) 
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void PushZerosToBackOfArray(int [] arr,int n)
	{
		int count=0;
		for(int i=0 ;i<n ; i++) {
			if(arr[i] != 0)
			{
				arr[count++]=arr[i];
			}
		}
		while(count < n)
		{
			arr[count++]=0;
		}
	}
}