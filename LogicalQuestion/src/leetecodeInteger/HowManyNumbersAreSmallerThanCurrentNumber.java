package leetecodeInteger;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanCurrentNumber {
	public static void main(String[] args) {
	int nums[]= {8,1,2,2,3};
	System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
	}
	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int newnums[]=new int[nums.length];
		int k=0;
		for(int i=0;i<nums.length;i++) {
			int count=0;
			for(int j=0;j<nums.length;j++)
			{
				if(nums[j]<nums[i]) {
					{
						count++;
					}
				}
			}
			newnums[k]=count;
			k++;
			
		}
		return newnums;	        
	}
}
