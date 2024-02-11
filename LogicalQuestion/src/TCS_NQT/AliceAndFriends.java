package TCS_NQT;

import java.util.Arrays;
import java.util.Scanner;

public class AliceAndFriends {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int arr[]=new int [sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(arr[0]==arr[arr.length-1]) {
			System.out.println("0" ) ;	
			return;
			}
			if(arr[i]!=arr[0]) {
				count++;
			}
		}
		System.out.println(count);
	}
}