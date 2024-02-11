package leetecodeInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftandRightSumDifference {
	
public static int[] leftRightDifference(int[] nums) {
	List<Integer> ls=new ArrayList<Integer>();
	for(int i=0;i<nums.length;i++) {
		int rightsum=0;
		int leftsum=0;
		for(int j=i+1;j<nums.length;j++) {
			rightsum=rightsum+nums[j];
//			System.out.println("rightsum "+rightsum);
		}
		for(int k=0;k<i;k++) {
			leftsum=leftsum+nums[k];
//			System.out.println("leftsum "+leftsum);
		}
		int sum=Math.abs(leftsum-rightsum);
//		System.out.println("Sum "+sum);
		ls.add(sum);
	}
//	System.out.println();
//	System.out.println(ls);
	int output[]=new int [ls.size()];
	int m=0;
	for(int l:ls) {
		output[m]=l;
		m++;
	}
//	System.out.println(Arrays.toString(output));
	return output;        
}
public static void main(String[] args) {
	int nums[] = {10,4,8,3};
	System.err.println(Arrays.toString(leftRightDifference(nums)));
	
}
}
