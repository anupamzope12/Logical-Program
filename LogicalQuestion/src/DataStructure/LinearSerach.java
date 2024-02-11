package DataStructure;

import java.util.Scanner;

public class LinearSerach {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {45,89,2,49,23,01};
		System.out.println("Enter the element to search");
		int x=sc.nextInt();
		for(int i=0 ; i<arr.length ;i++) {
			if(x==arr[i]) {
				System.out.println(x);
			}
		}
	}
}
