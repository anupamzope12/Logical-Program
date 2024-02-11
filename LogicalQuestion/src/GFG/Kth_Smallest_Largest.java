package GFG;

import java.util.Arrays;
import java.util.Scanner;

public class Kth_Smallest_Largest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,5,4,7,9,6};
		System.out.println("Enter K elemet");
		int k=sc.nextInt();
		System.out.println(KthElement(arr,k ));
	}
	
	static int KthElement(int arr[],int k) {
		
	Arrays.sort(arr);
	System.out.println(arr.toString());
	
	return k;

	}
}
