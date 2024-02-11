package leetecodeInteger;

public class TwoSum {
//	public static void main(String[] args) {
		public static int[] twoSum(int[] nums, int target) {
		        for(int i=0 ;i<nums.length ;i++) {
		        	for(int j=1 ;j<nums.length;j++) {
		        		if(nums[i]+nums[j]==target) {
		        			System.out.println("["+i+","+j+"]");
		        		}
		        	}
		        }
				return nums;		        
}
	
public static void main(String[] args) {
	int num []= {10,20,30,40,50,60,70};
	int target=70;
	twoSum(num, target);
	}
}