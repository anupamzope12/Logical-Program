package GFG;

import java.util.Arrays;

public class IndexAndIntersection {
	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,50,60,45,10,40,20};
		int index=0;
		int newarr[]=new int[arr1.length];	
		for(int i=0 ;i<newarr.length-1;i++) {
			if(arr1[i] != arr1[i+1]) {
				newarr[index]=arr1[i];
				index++;
		}
	
		}
		System.out.println(Arrays.toString(newarr));

  }
}