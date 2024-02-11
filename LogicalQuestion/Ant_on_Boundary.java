package leetecodeInteger;

public class Ant_on_Boundary {
	public static void main(String[] args) {
		int [] nums= {10,-10,8};
		System.out.println(returnToBoundaryCount(nums));;
	}
	 public static int returnToBoundaryCount(int[] nums) {
		  int position = 0;
	        int time = 0;
	        for (int i = 0; i < nums.length; i++) {
	            position += nums[i];
	            if (position == 0) {
	                time++;
	            }
	        }
	   return time;
    }
}