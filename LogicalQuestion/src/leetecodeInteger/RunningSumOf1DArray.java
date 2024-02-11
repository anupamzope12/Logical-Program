package leetecodeInteger;

import java.util.Arrays;

public class RunningSumOf1DArray {
public static void main(String[] args) {
	int [] nums= {1,2,3,4,5};
	System.out.println(runningSum(nums));;
}
public static int[] runningSum(int[] nums) {
//	int k=0;
//	int newarr[]=new int [nums.length];
//	for(int i=nums.length;i>0;i--) {
//		int sum=0;
//		for(int j=0;j<i;j++) {
//			sum=sum+nums[j];
//		}
//		newarr[k]=sum;
//		k++;
//		System.out.println(sum);
//	}
//	int m=0;
//	int [] ne=new int [newarr.length];
//	for(int i=newarr.length-1;i>=0;i--) {
//		ne[m]=newarr[i];
//				m++;
//	}
//	
//	System.out.println(Arrays.toString(ne));;
//	 return ne; 
  //  public static int[] runningSum(int[] nums) {
        
        for(int i=1; i<nums.length; i++){
             nums[i] = nums[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
   }
