package GFG;

import java.util.Arrays;
import java.util.Scanner;

public class ad {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]= {12,23,45,12,23,56,123,154,12,32};
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);;;
	System.out.println(Arrays.toString(arr));
	System.out.println("Enter the element");
	int k=sc.nextInt();
	
	for(int i=1 ;i<=k-1; i++) {
		if(i==(k-1)) {
			System.out.println("kth smallest elemet :-" + arr[i]);
		}
	}
	
	for(int i=arr.length-1 ;i>=k-1; i--) {
		if(i==(k-1)) {
			System.out.println("kth largest elemet =" + arr[i]);
		}
	}
System.out.println(arr[arr.length - k]);
System.out.println(arr[k]);
  }
}