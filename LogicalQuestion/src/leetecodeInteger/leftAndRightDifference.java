package leetecodeInteger;

import java.util.Arrays;

public class leftAndRightDifference {
public static void main(String[] args) {
	int arr[]= {10,4,3,8};
//	System.out.println(Arrays.toString(leftRightDifference(arr)));
	System.out.println(leftRightDifference(arr));

}
public static int[] leftRightDifference(int[] nums) {
	int larr[]=new int[nums.length];
	int z=0;
	for(int i=1;i<=nums.length;i++) {
		int sum=0;
		for(int j=i;j<nums.length;j++)
		{
			sum=sum+nums[j];
		}
		larr[z]=sum;
		z++;
	}
	System.out.println(Arrays.toString(larr));

	int rarr[] = new int[nums.length];
	int x=3;
	for(int i=0;i<nums.length;i++) {
		int sum1=0;
		for(int j=nums.length-i;j>0;j--)
		{
			System.out.println(nums[j]);
			sum1=sum1+nums[j];
		}
		rarr[x]=sum1;
		x--;
	}
	System.out.println(Arrays.toString(rarr));

	return larr;        
    }
}