//package leetecodeInteger;
//
//public class ThreeSum {
//public static void main(String[] args) {
//	int arr[]= {-1,0,1,-2,-1,1,-4};
//	for(int i=0;i<arr.length-2;i++) {
//		for(int j=i+1;j<arr.length-1;j++) {
//			for(int k=j+1;k<arr.length;k++) {
//				if(arr[i]+arr[k]+arr[j]==0) {
//					System.out.println("["+arr[i]+","+arr[k]+","+arr[j]+","+"]");
//				}
//			}
//		}
//	}
//}
//}

package leetecodeInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//public class ThreeSum {
//    public static void main(String[] args) {
//        int arr[] = {-1, 0, 1, -2, -1, 1, -4,4};
//        List<List<Integer>> result = threeSum(arr);
//
//        for (List<Integer> triplet : result) {
//            System.out.println(triplet);
//        }
//    }
//
//    public static List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer> > triplets = new HashSet<>();
//
//        for (int i = 0; i < nums.length - 2; i++) {
//            for (int j = i + 1; j < nums.length - 1; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        List<Integer> triplet = new ArrayList<>();
//                        triplet.add(nums[i]);
//                        triplet.add(nums[j]);
//                        triplet.add(nums[k]);
//                        triplet.sort(null);
//                        triplets.add(triplet);
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(triplets);
//    }
//}

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, -2, -1, 1, -4,4};
        List<List<Integer>> result = threeSum(arr);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> ans = new ArrayList<>();

    	// Sort the array
    	Arrays.sort(nums);

    	for (int i = 0; i < nums.length - 2; i++) {
    	    // Skip duplicate elements for i
    	    if (i > 0 && nums[i] == nums[i - 1]) {
    	        continue;
    	    }

    	    int j = i + 1;
    	    int k = nums.length - 1;

    	    while (j < k) {
    	        int sum = nums[i] + nums[j] + nums[k];

    	        if (sum == 0) {
    	            // Found a triplet with zero sum
    	            ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

    	            // Skip duplicate elements for j
    	            while (j < k && nums[j] == nums[j + 1]) {
    	                j++;
    	            }

    	            // Skip duplicate elements for k
    	            while (j < k && nums[k] == nums[k - 1]) {
    	                k--;
    	            }

    	            // Move the pointers
    	            j++;
    	            k--;
    	        } else if (sum < 0) {
    	            // Sum is less than zero, increment j to increase the sum
    	            j++;
    	        } else {
    	            // Sum is greater than zero, decrement k to decrease the sum
    	            k--;
    	        }
    	    }
    	}
    	return ans;
    	}
}