//package leetecodeInteger;
//
//public class NumberofArithmeticTriplets {
//	public static void main(String[] args) {
//		int [] nums = {0,1,4,6,7,10};
//		int diff = 3;
//		System.out.println(arithmeticTriplets(nums, 3));
//
//	}
//	
//	 public static int arithmeticTriplets(int[] nums, int diff) {
//	int count=0;
//		 for(int i=0;i<nums.length-2;i++) {
//			 for(int j=i+1;j<nums.length-1;j++) {
//				 for(int k=j+1;k<nums.length;k++)
//				 { 
//					 	if(nums[i]-nums[j]==diff && nums[j]-nums[k]==diff) {
//					 			count++;
//					 	}
//				 }
//			 }
//		 }
//		return count;
//	        
//		 
//	}
//}

package leetecodeInteger;

public class NumberofArithmeticTriplets {
    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;
        System.out.println(arithmeticTriplets(nums, diff));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
