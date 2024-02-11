package TCS_NQT;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateFactory {
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements into array");
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int nonZeroIndex = 0;

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                int temp = arr[i];
//                arr[i] = arr[nonZeroIndex];
//                arr[nonZeroIndex] = temp;
//                nonZeroIndex++;
//            }
//        }

		for(int i=0 ;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[nonZeroIndex]=arr[i];
				nonZeroIndex++;
			}
		}
		while(nonZeroIndex<arr.length) {
			arr[nonZeroIndex]=0;
			nonZeroIndex++;
		}
		System.out.println(Arrays.toString(arr));;
	}
}