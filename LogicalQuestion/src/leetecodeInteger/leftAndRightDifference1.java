package leetecodeInteger;

import java.util.Arrays;

public class leftAndRightDifference1 {
	public static void main(String[] args) {
		int arr[]= {1,3,2,5,9};
	System.out.println(Arrays.toString(leftRigthDifference(arr)));;	
	}
	    public static int[] leftRigthDifference(int[] nums) {
	        int lsum[] = new int[nums.length];
	        int rsum[] = new int[nums.length];
	        int res[] = new int[nums.length];
	        for(int i=1; i<nums.length; i++)  
	        	{
	        	   lsum[i] = lsum[i-1]+nums[i-1];
	        	}
	        for(int i=nums.length-2; i>=0; i--)  
	        	{
	        		rsum[i] = rsum[i+1] + nums[i+1];
	        	}
	        for(int i=0; i<nums.length; i++)
	        	{
	        		res[i] = Math.abs(lsum[i]-rsum[i]);
	        	}
	        System.out.println(Arrays.toString(lsum));
	        System.out.println(Arrays.toString(rsum));
	        System.out.println(Arrays.toString(res));
	        return res;
	        
	    }
}
