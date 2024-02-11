package Array;

import java.util.Scanner;

public class IndexOfElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arr[]=new int[sc.nextInt()];
		
		System.out.println("Enter the arrays elements");
		for(int i=0 ; i<arr.length ; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Print all array elements");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		System.out.println("enter the elements to find the index");
		int x=sc.nextInt();
		for(int i=0; i<arr.length ; i++)
		{
			if(arr[i]==x) {
				System.out.println("Element present at index " + i + " ");
			}
		}	
	}
}