package Array;

import java.util.Scanner;

public class PrintArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int [] arr= {10,56,20,36,78};
		for(int i=0 ; i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("Enter the size of array");
		int x=sc.nextInt();
		
		int []array=new int[x];
		System.out.println("enter the array elements");
		for(int i=0; i<array.length;i++) {
				array[i]=sc.nextInt();
		}
		
		System.out.println("Array elements are");
		for(int i=0; i<array.length;i++) {
			System.out.print( array[i] + " " );
		}
		
		System.out.println();
	}
	
}