package leetecodeInteger;

import java.util.Arrays;

public class ThreeClosetSum {
public static void main(String[] args) {
	int [] nums= {1,2,-1,0,3};
System.out.println(	threeSumcloset(nums, 5));;
	
}
	public static int threeSumcloset(int nums[],int target) {
		Arrays.sort(nums);
		int closetSum=nums[0]+nums[1]+nums[2];
		for(int i=0;i<nums.length-2;i++) {
			int j=i+1;
			int k=nums.length-1;
			while(j<k) {
				int sum=nums[i]+nums[j]+nums[k];
				if(Math.abs(target-sum)<Math.abs(target-closetSum)) {
					closetSum=sum;
				}
				if(sum<target) {
					j++;
				}
				else {
					k--;
				}
			}
		}
		return closetSum;
	}
}
