package leetecodeInteger;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_II {
public static void main(String[] args) {
	int arr[]= {1,2,3,1,2,3};
	ContainsDuplicate_II cd=new ContainsDuplicate_II();
	System.out.println(cd.containsNearbyDuplicate(arr, 2));;
	
}
//	public boolean containsNearbyDuplicate(int[] nums, int k) {
//		for(int i=0;i<nums.length-1;i++) {
//			for(int j=i+1;j<nums.length;j++)
//			{
//				if(nums[i]==nums[j]) {
//					int a=Math.abs(i-j);
//					if(a<=k) {
//						return true;
//					}
//				}
//			}
//		}
//		return false;
//	}
// OR
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k)
            	set.remove(nums[i-k-1]);
            if(!set.add(nums[i]))
            	return true;
        }
        return false;
    }

}
