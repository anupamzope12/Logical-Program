package GFG;

import java.util.Arrays;

public class MoveNegativeElements {
public static void main(String[] args) {
		int arr[]= {2,-2,-1,1,-3,4,5,-8,6};
		//Approach one
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		int count=0;
		int negIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				count++;
			}
		}
		
		System.out.println(count);
		int negarr[] = new int[count];
		int posarr[] = new int [arr.length-count];
		
		for(int i=0 ;i<arr.length ;i++) {
			if(arr[i]<0) {
				negarr[negIndex]=arr[i];
				negIndex++;
			}
		}
		int posIndex=0;
		for(int i=0 ;i<arr.length ;i++) {
			if(arr[i]>=0) {
				posarr[posIndex]=arr[i];
				posIndex++;

			}
		}
		
		int newarr[]=new int[posarr.length+negarr.length];
		
		for(int i=0 ; i<negarr.length ;i++) {				
			newarr[i]=negarr[i];
		}
		for(int i=0;i<posarr.length;i++)
		{
			newarr[negarr.length+i]=posarr[i];
		}
		for(int i=0;i<newarr.length ;i++) {
			System.out.print(newarr[i] + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(newarr));
					
	}
}