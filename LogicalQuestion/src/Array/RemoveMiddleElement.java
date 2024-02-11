package Array;

import java.util.Arrays;

public class RemoveMiddleElement {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int newarr[] = new int[arr.length-1];
	int l=0;
	int mid=arr.length/2;
	for(int i=0 ;i<arr.length;i++) {
			if(i!=mid) {
			newarr[l]=arr[i];
					l++;
	  }
	}
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(newarr));
  }
}