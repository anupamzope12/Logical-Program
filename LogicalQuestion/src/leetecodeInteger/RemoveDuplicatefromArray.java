package leetecodeInteger;

import java.util.Arrays;

public class RemoveDuplicatefromArray {
	public static void main(String[] args) {
		
		int[] arr= {10,20,5,10,20,60,9,40,78,9,63,215,58,54};
		int [] newarr=new int [arr.length];
		int k=0;
		for(int i=0 ;i<arr.length;i++) {
			boolean isDuplicate=false;
			for(int j=0;j<k;j++) {
				if(arr[i]==newarr[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				newarr[k]=arr[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(newarr));
	}
}