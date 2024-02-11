package coupa;

import java.util.Arrays;

public class MaxMinDiff {
	public static void main(String[] args) {
	int arr[]= {56,89,1,41,1,1,2,5,6,7,12,15};
	int m=3;
//	String []str= {"sddf","sdr0","Asdf0"};
	Arrays.sort(arr);
	for(int i=0 ;i<arr.length ;i++)
	{
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	int minSum=0;
	for(int i=0 ;i<m ;i++) {
		minSum=minSum+arr[i];
	}
	System.out.println(minSum);
	int maxSum=0;
	for(int i=arr.length-1 ;i>arr.length-m ;i--) {
		maxSum=maxSum+arr[i];
	}
	System.out.println(maxSum);
	System.out.println(maxSum-minSum);
	}
}