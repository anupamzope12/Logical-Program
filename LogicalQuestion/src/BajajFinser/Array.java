package BajajFinser;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0 ;i<arr.length ;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Print all array elements");
		for(int i=0 ;i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		int mid=arr.length/2;
		int [] leftArray=new int[mid];
		int [] rightArray=new int [arr.length-mid];
		
		System.out.println("Left part");
		for(int i=0 ; i<mid ; i++)
		{
			leftArray[i]=arr[i];
		}
		
		System.out.println("Right part");		
		for(int i=mid ; i<arr.length ;i++)
		{
			rightArray[i-mid]=arr[i];
		}
//		System.out.println(rightArray.length);
		
		int concatArray[]=new int[leftArray.length+rightArray.length];
		
		for(int i=0;i<rightArray.length;i++) {
			concatArray[i]=rightArray[i];
		}
		
		for(int i=0 ; i<leftArray.length;i++) {
			concatArray[rightArray.length+i]=leftArray[i];
		}
		System.out.println("concatArray");
		for(int i=0;i<concatArray.length ;i++) {
			System.out.print(concatArray[i] + " ");
		}	
	}
}