package GFG;

import java.util.Arrays;

public class RearrangeArrayInPositiveandNegative {
	public static void main(String[] args) {
		int arr[]= {-5,10,-23,20,30,-62,04,50};
		int count=0;
		for(int i=0 ; i<arr.length;i++) {
			if(arr[i]<0) {
				count++;
			}
		}
		System.out.println(count);
		
	int [] negarr=new int[count];
	int [] posarr=new int[arr.length-count];
	
	int k=0;
	int l=0;
	for(int i=0 ;i<arr.length ;i++) {
		if(arr[i]<0) {
			negarr[k]=arr[i];
			k++;
			}
		else
		{
			posarr[l]=arr[i];
			l++;
			}
	}
	
	System.out.println(Arrays.toString(negarr));
	System.out.println(Arrays.toString(posarr));
	
	 int minLen = Math.min(negarr.length, posarr.length);

     for (int i = 0; i < minLen; i++) {
         System.out.print(negarr[i] + " " );
         System.out.print(posarr[i] + " " );
     }

     // Print any remaining elements from the longer array
     for (int i = minLen; i < negarr.length; i++) {
         System.out.print(negarr[i] + " ");
     }
     for (int i = minLen; i < posarr.length; i++) {
         System.out.print(posarr[i] + " ");
     }
	}
}