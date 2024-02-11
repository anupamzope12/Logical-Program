package leetecodeInteger;

import java.util.Arrays;
import java.util.HashSet;

public class FindCommonElementsBetweenTwoArrays {
	public static void main(String[] args) {
		int [] nums1 = {4,3,2,3,1};
		int [] nums2 = {2,2,5,2,3,6};
		System.out.println(Arrays.toString(findIntersectionValues(nums1, nums2)));;;

	} 
	public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
		HashSet<Integer>hs1=new HashSet<>();
		HashSet<Integer>hs2=new HashSet<>();

		for(int i=0;i<nums1.length;i++) {
			hs1.add(nums1[i]);
		}
		for(int i=0;i<nums2.length;i++) {
			hs2.add(nums2[i]);
		}
		int count1=0;
		for(int num1:nums1) {
			if(hs2.contains(num1))
			{
				count1++;
			}
		}
		System.out.println(count1);

		int count2=0;
		for(int num2:nums2) {
			if(hs1.contains(num2))
			{
				count2++;
			}
		}
		System.out.println(count2);
//		int arr[]= {count1,count2};
		return new int[]{count1, count2};
	        
	    }
}
