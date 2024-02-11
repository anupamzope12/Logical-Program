package leetecodeInteger;

import java.util.Arrays;

public class BuildArrayFromPermutation {
	public static void main(String[] args) {
	int buildArray[]= {0,2,1,5,3,4};
//	System.out.println(inbuildArray(buildArray).toString());;
	int resultArray[] = inbuildArray(buildArray); // Store the returned array
    System.out.println(Arrays.toString(resultArray)); 
	
	}
	public static int[] inbuildArray(int [] arr) {
		int [] newbuildArray=new int[arr.length];
		int j=0;
		for(int i=0 ;i<arr.length;i++) {
			newbuildArray[j]=arr[arr[i]];
			j++;
		}
		System.out.println(Arrays.toString(newbuildArray));
		return newbuildArray;
		
	}
}
