
package leetecodeInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateATargetArrayinTheGivenOrder2{
	public static void main(String[] args) {
		int nums[] = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
	}
    public static int[] createTargetArray(int[] nums, int[] index) {
		List<Integer>targetList=new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			targetList.add(index[i], nums[i]);
		}
        int[] targetArray = targetList.stream().mapToInt(Integer::intValue).toArray();

		return targetArray;
    
    }
	
}