package leetecodeInteger;

import java.util.HashMap;

public class MajorityElement1 {
	public static void main(String[] args) {
		int arr[]= {2,6,2,4,2,2,8,2};
		int majorityElement = majorityElement(arr);
	

		System.out.println("The majority element is: " + majorityElement);
		majorityElement(arr);
	}
	
	public static int majorityElement(int []nums) {
		HashMap<Integer,Integer> hsmap=new HashMap<>();
		for(int num:nums) {
//			System.out.println(num);
			hsmap.put(num, hsmap.getOrDefault(num, 0)+1);
		}
//		System.out.println(hsmap.toString());
		int n=nums.length;
		for(int key:hsmap.keySet()) {
//			System.out.println(key);
			if(hsmap.get(key)>n/2) {
				return key;
			}
		}
		return -1;
	}
}