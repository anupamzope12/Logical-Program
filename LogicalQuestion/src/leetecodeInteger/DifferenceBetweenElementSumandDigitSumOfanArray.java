package leetecodeInteger;

public class DifferenceBetweenElementSumandDigitSumOfanArray {
public static int differenceOfSum(int[] nums) {
	int sum=0;
	int sum1=0;
	for(int i=0;i<nums.length;i++) {
		sum=sum+nums[i];
		
		while(nums[i]>0) {
			int rem=nums[i]%10;
			sum1=sum1+rem;
			nums[i]=nums[i]/10;
		}
	}
	System.out.println(sum+  "  sum");
	System.out.println(sum1+  "  sum1");

	return Math.abs(sum1-sum);    
    }
public static void main(String[] args) {
	int [] nums = {1,15,6,3};
	System.out.println(differenceOfSum(nums));;

}
}
